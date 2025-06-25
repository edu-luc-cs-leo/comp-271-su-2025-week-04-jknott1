public class DoubleLinkedList_Implementation {
    public static void main(String[] args) {
        // Setup a couple of test linked lists.
        DoubleLinkedList foo = new DoubleLinkedList("foo");
        DoubleLinkedList bar = new DoubleLinkedList("bar");
        foo.add("Hello World!");
        bar.add("Howard");
        bar.add("Jarvis");
        // Test add(String)
        if (foo.size() * bar.size() == 0) {
            System.out.println("Method add(String) is not working properly.");
            return;
        }
        // Test compareTo
        if ((foo.compareTo(bar) * bar.compareTo(foo) < 0 &&
                (foo.compareTo(foo) == 0))) {
            System.out.println("Method compareTo passes basic logic test");
        } else {
            System.out.println("Method compareTo fails basic logic test");
            System.out.println((foo.compareTo(bar) * bar.compareTo(foo)));
        }
    } // method main

}