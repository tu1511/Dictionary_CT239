package model;

public class LinkList {
    private int size;
    private Node head;

    public LinkList() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Thêm một nút vào đầu danh sách
    public void addToHead(Data value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    // Thêm một nút vào cuối danh sách
    public void addToTail(Data value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    // Xóa một nút chứa từ có giá trị là word
    public void delete(String word) {
        if (head == null) {
            return;
        }

        if (head.getValue().getWord().equals(word)) {
            head = head.getNext();
            size--;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().getWord().equals(word)) {
                current.setNext(current.getNext().getNext());
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public void updateNode(String oldValue, Data newValue) {
        Node current = head;
        Node prev = null;

        // Tìm nút chứa dữ liệu cần cập nhật
        while (current != null && !current.getValue().getWord().equals(oldValue)) {
            prev = current;
            current = current.getNext();
        }

        // Nếu tìm thấy nút chứa dữ liệu cần cập nhật
        if (current != null) {
            // Xóa nút đó khỏi danh sách liên kết
            if (prev == null) {
                // Nếu nút cần xóa là nút đầu tiên
                head = current.getNext();
            } else {
                // Nếu nút cần xóa không phải là nút đầu tiên
                prev.setNext(current.getNext());
            }
            size--;

            // Thêm một nút mới chứa dữ liệu mới vào danh sách liên kết
            addToTail(newValue);
        }
    }

    
    // Tìm kiếm nút chứa từ có giá trị là word
    public Node search(String word) {
        Node current = head;
        while (current != null) {
            if (current.getValue().getWord().equals(word)) {
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
    
   

    // Lấy dữ liệu từ một nút
    public Data getData(Node node) {
        return node != null ? node.getValue() : null;
    }
}
