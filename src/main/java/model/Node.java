package model;

public class Node {
    private String key;
    private String value;
    private Node next;

    // Constructor
    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    // Getter for key
    public String getKey() {
        return key;
    }

    // Setter for key
    public void setKey(String key) {
        this.key = key;
    }

    // Getter for value
    public String getValue() {
        return value;
    }

    // Setter for value
    public void setValue(String value) {
        this.value = value;
    }

    // Getter for next node
    public Node getNext() {
        return next;
    }

    // Setter for next node
    public void setNext(Node next) {
        this.next = next;
    }
}
