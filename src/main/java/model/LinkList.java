package model;

public class LinkList {
    private int size;
    private Node tail;
    private Node head;

    public LinkList() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }
    
    public LinkList(int size, Node tail, Node head) {
        this.size = size;
        this.tail = tail;
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setHead(Node head) {
        this.head = head;
    } 
    
    // Thêm một nút vào đầu danh sách
    public void addToHead(Data value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    // Thêm một nút vào cuối danh sách
    public void addToTail(Data value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    
    public void insertAt(Data value, int position) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Tạo một nút mới với giá trị cần thêm
        Node newNode = new Node(value);

        // Trường hợp đặc biệt: nếu danh sách rỗng hoặc muốn thêm vào đầu danh sách
        if (position == 0) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        } 
        // Trường hợp đặc biệt: nếu muốn thêm vào cuối danh sách
        else if (position == size) {
            tail.setNext(newNode);
            tail = newNode;
        } 
        // Thêm vào vị trí khác
        else {
            // Tìm nút tại vị trí trước vị trí cần thêm
            Node previous = head;
            for (int i = 0; i < position - 1; i++) {
                previous = previous.getNext();
            }

            // Cập nhật liên kết của nút mới
            newNode.setNext(previous.getNext());

            // Cập nhật liên kết của nút trước nút mới
            previous.setNext(newNode);
        }

        // Tăng kích thước danh sách
        size++;
    }

    // Xóa nút từ danh sách
    public void delete(Node node) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (current == node) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                    if (current.getNext() == null) {
                        tail = previous;
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }

    // Tìm kiếm nút trong danh sách
    public Node search(Data value) {
        Node current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    // In ra danh sách
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println("Value: " + current.getValue().toString());
            current = current.getNext();
        }
    }

    public Data getData(Node node) {
        return node != null ? node.getValue() : null;
    }

   
}
