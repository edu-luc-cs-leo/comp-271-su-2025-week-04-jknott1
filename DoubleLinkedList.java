public class DoubleLinkedList implements Comparable<nfs_DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;
    private int size; // ASSIGNMENT 04 - added new parameter that keeps count of nodes.

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.size = 0 // ASSIGNMENT 04 - sets default value to 0, as no nodes exist in the linked list yet. 
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail); // ASSIGNMENT 04 - sets each 
        }
        this.tail = node;
        this.size++; // This increases the size variable by 1 whenever a node is added to the list
    } // method add

    // overload method add to add a node by value
    public void add(String value) {
        Node node1 = new Node(); // creates a new Node object
        node1.value = value; // the value of the new node 
        if (this.head == null) {
            this.head = node1;
        } else {
            this.tail.setNext(node1);
            node1.setPrevious(this.tail); // sets new node's previous cursor to the old node. 
        }
        this.tail = node1;
        this.size++; 
    } // method add



    // implement the comparable interface
    public int compareTo(nfs_DoubleLinkedList other) {
        return -1234567;
    } // method compareTo
} // class DoubleLinkedList
