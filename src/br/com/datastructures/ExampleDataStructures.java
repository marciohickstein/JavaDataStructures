
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class ExampleDataStructures {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // How to use my stack data structures
        
        // --- <STACK> ---

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

        // --- <STACK> ---
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