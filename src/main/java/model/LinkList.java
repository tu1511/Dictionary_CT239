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

   
}
