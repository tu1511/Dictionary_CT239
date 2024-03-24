package model;

public class Node {
    private String key;
    private Dictionary value;
    private Node next;

    // Constructor
    public Node(String key, Dictionary value) {
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
    public Dictionary getValue() {
        return value;
    }

    // Setter for value
    public void setValue(Dictionary value) {
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
