public class DoubleLinkedList implements Comparable<DoubleLinkedList> {

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
        this.size = 0; // ASSIGNMENT 04 - sets default value to 0, as no nodes exist in the linked list yet.
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        String retStr = "[";
        Node cursor = this.head;
        boolean first = true;
        while (cursor != null) {
            if (first) {
                retStr += "\"" + cursor.getValue() + "\"";
                first = false;
            } else {
                retStr += ", " + "\"" + cursor.getValue() + "\"";
            }
            cursor = cursor.getNext();
        }
        retStr += "]";
        return retStr;
    } // method toString

    /**
     * Accessor for name property
     */
    public String getName() {
        return name;
    } // method getName

    /**
     * Accessor for value property
     */
    public int size() {
        return size;
    } // method getSize

    /**
     * Add a new node to the linked list. This method (as opposed to the one seen later) assumes that there is a
     * node already and adds it to the linked list
     * */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail); // ASSIGNMENT 04 - sets the new node's tail to 0
        }
        this.tail = node;
        this.size++; // This increases the size variable by 1 whenever a node is added to the list
    } // method add

    // overload method add to add a node by value
    /**
     * This method is an overload method. If there is no node with the specified value, then this will build one with
     * that value and add it on. This adds a new node to the list with a "value" of the string given. It follows the
     * same basic structure os the other add method. The difference here is that a new node object is initialized with
     * its "value" parameter set to the string.
     */
    public void add(String value) {
        Node node = new Node(value); // creates a new Node object with value (property) of value (parameter)
        // If the list is empty, then the new node will be the head. It will not have a node before or after it (yet).
        if (this.head == null) {
            this.head = node;
        // if the list isn't empty, then the node is added on to the end, and said node's previous node is set to the
        // old tail.
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail); // sets new node's previous cursor to the old node.
        }
        // replace the "tail" of the list with the new node, as it took the place as the tail.
        this.tail = node;
        // because a new node was added to the list, the size increases by 1.
        this.size++;
    } // method add

    // implement the comparable interface

    /**
     * At first, I wanted to implement this lexicographically as I think there is more everyday use for that, but there
     * were a couple issues (dealing with ASCII characters, casing, magnitude of indices, etc.) leading me to implement
     * based on their size - a much simpler task.
     *
     * Compares the first character of the two linked lists and returns the difference between the two as determined by
     * the difference in their sizes.
     * @param other the object to be compared.
     * @return this.size - other.size
     */
    public int compareTo(DoubleLinkedList other) {
        // each list keeps track of its length, taking the difference and returning them is all that needs to happen.
        return this.size - other.size;
    } // method compareTo

    /**
     * This method takes user given input and scans the given list to see whether a node with a value of that input.
     * If no such node exists, a default value is returned.
     */
    public int indexOf(String value) {
        // default value for the index (can't be negative 1)
        int index = -1;
        // cursor Node object is set up to traverse the list. Starts at the head of the list.
        Node cursor = this.head;
        // cursor index is initialized.
        int i = 0;
        // loop traverses through list either until it finds the value, or it reaches the end.
        while (cursor != null && cursor.getValue() != value) {
            i++; // cursor index updated.
            cursor = cursor.getNext(); // sets cursor to next node in list.
        }
        
        // when the cursor reaches the end of the list without finding the value, the proper index os kept as the
        // default.
        if (cursor != null) {
            index = i;
        }
        return index;
    } // method indexOf

    /**
     * This method checks whether or not a specified Node with a user-given input exists within the list.
     * @param value
     * @return
     */
    public boolean contains(String value) {
        // indexOf kind of does this implicitly. It returns 1 if the Node isn't in the list. So, if -1 is returned,
        // then the Node doesn't exist.
        return this.indexOf(value) != -1;
    } // method contains
} // class DoubleLinkedList
