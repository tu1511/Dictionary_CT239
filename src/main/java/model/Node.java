package model;

public class Node {
    private Data value;
    private Node next;

    // Constructor
    public Node(Data value) {
        this.value = value;
        this.next = null;
    }

    public Data getValue() {
        return value;
    }

    public void setValue(Data value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public String getData() {
        return ("Từ tiếng anh\t   : "+value.getEnglish()+"\n\n Loại từ\t   : "+value.getType()+"\n\n Nghĩa tiếng việt : "+value.getMeaning()+"\n\n Ví dụ\t   : "+value.getExample());
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';
    }
    
    
}
