package model;

public class Node {
    private Data value;
    private Node next;

    // Constructor
    public Node(String key, Data value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
        this.value = null;
        this.next = null;
    }

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
        return (value.getEnglish()+"-"+value.getType()+"-"+value.getMeaning()+"-"+value.getExample() +"-false"+"\n");
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';
    }
    
    
}
