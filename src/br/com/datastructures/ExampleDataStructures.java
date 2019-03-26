
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class ExampleDataStructures {

    public static void testLinkedList(){
        LinkedList<String> list = new LinkedList<>();
        Node<String> node1 = new Node<>("1");
        Node<Integer> node2 = new Node<>(2);
        Node<Double> node3 = new Node<>(3.0);
        Node<Integer> node4 = new Node<>(2);

        System.out.println(node1.equals(node1));
        System.out.println(node1.equals(node2));
        System.out.println(node2.equals(node3));
        System.out.println(node2.equals(node4));

        list.add("1");
        list.add("2");
        list.add("3");
        
        list.printLinkedList();
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
        testLinkedList();
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