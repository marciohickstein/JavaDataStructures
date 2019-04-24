
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class ExampleDataStructures {

    public static void testLinkedList(){
        LinkedList<Integer> listInt = new LinkedList<>();
        LinkedList<String> listString = new LinkedList<>();
        Node<String> node1 = new Node<>("1");
        Node<Integer> node2 = new Node<>(2);
        Node<Double> node3 = new Node<>(3.0);
        Node<Integer> node4 = new Node<>(2);

        System.out.println(node1.equals(node1));
        System.out.println(node1.equals(node2));
        System.out.println(node2.equals(node3));
        System.out.println(node2.equals(node4));

        listString.add("A");
        listString.add("b");
        listString.add("C");
        System.out.println("Print linked list of string");
        listString.printLinkedList();

        listString.remove("X");
        System.out.println("Total elements " + listString.size());
        listString.printLinkedList();
        
        System.out.println("Print linked list of integer");

        Node<Integer> removed = null;
        
        // List empty
        // Remove element in empty list
        removed = listInt.remove(2);
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");
        listInt.printLinkedList();

        // List 1 -> null
        // Removing item in list with one element
        listInt.add(1);
        removed = listInt.remove(1);
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");
        listInt.printLinkedList();

        // List 1 -> 2 -> 3 -> null
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.printLinkedList();
        
        // Remove second element in the middle of list
        removed = listInt.remove(2);
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");
        listInt.printLinkedList();

        // List 1 -> 3 -> null
        // Remove first element 
        removed = listInt.remove(1);
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");
        listInt.printLinkedList();

        // List 3 -> null
        removed = listInt.remove(3);
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");

        // List 1 -> 2 -> 3 -> null
        // Remove last element
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        removed = listInt.remove(3);
        listInt.printLinkedList();
        if (removed != null)
            System.out.println("Element " + removed.getData() + " removed!");

        System.out.println("Total elements " + listInt.size());
    }
 
    public static void testNode(){
        Node<Integer> nodeInteger = new Node<>(100);
        Integer valueInteger = nodeInteger.getData();
        
        if (valueInteger == 100)
            System.out.println("Test 1: OK");
        else
            System.out.println("Test 1: FAIL");
        nodeInteger.setNext(new Node<>(200));
        if (nodeInteger.getNext() == null)
            System.out.println("Test 2: OK");
        else
            System.out.println("Test 2: FAIL");
    }
    
    public static void testQueue(){
        // Example string queue
/*
        Queue<Integer> queue = new Queue<>(2);        
        
        queue.printQueue();
        queue.add(1);
        queue.printQueue();
        queue.add(2);
        queue.printQueue();
        
        queue.remove();
//System.out.println(queue.remove());
        queue.printQueue();
        //System.out.println(queue.remove());
        queue.remove();
        queue.printQueue();
*/
        Queue<String> messages = new Queue<>(3);
        
        messages.printQueue();
        messages.add("stringA");
        messages.add("stringB");
        messages.add("stringC");
        messages.printQueue();

        messages.remove();
        messages.printQueue();
        
        messages.add("stringD");
        messages.printQueue();
    }

    public static void testStack(){
        // Example string stack
        Stack<String> stack = new Stack<>(6);
            
        stack.push("C");
        stack.push("B");
        stack.push("A");
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Example book stack
        Stack<Book> bookStack = new Stack<>(3);
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Poder sem limites", "Tony Robbins");
        Book book3 = new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler");

        bookStack.push(book3);
        bookStack.push(book2);
        bookStack.push(book1);
        
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());
        System.out.println(bookStack.pop());

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // How to use my stack data structures
        
        // --- <STACK> ---
        //testStack();
        
        // --- <STACK> ---
        
        // --- <QUEUE> ---
        //testQueue();

        // --- <LINKEDLIST> ---
        testNode();
        //testLinkedList();
    }
    
}

class Book{
    private String title;
    private String author;
    
    public Book(String name, String author){
        this.title = name;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    @Override
    public String toString(){
        return getTitle() + " - " + getAuthor();
    }
}