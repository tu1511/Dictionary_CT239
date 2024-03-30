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

    // Chèn một nút vào vị trí position
    public void insertAt(Data value, int position) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }

        Node newNode = new Node(value);

        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
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
