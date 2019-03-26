
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class LinkedList<T> {
    private Node<T> head;
    
    public LinkedList(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void printLinkedList(){
        int i = 0;
        Node node = head;

        while(node != null){
            System.out.println("Index [ " + (i++) +  " ] " + node.getData().toString());
            node = node.getNext();
        }
    }
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        
        if (isEmpty()){
            head = newNode;
            head.setNext(null);
        }else{
            Node node = head;
            Node nextNode = head.getNext();

            while(nextNode != null){
                node = nextNode;
                nextNode = node.getNext();
            }
            
            node.setNext(newNode);
        }
    }
    
    public Node<T> remove(T data){
        if (isEmpty())
            return null;

        Node<T> nodeToRemove = new Node<>(data);

        Node node = head;
        
        Node nextNode = node.getNext();

        do 
        {
            if (node.equals(nodeToRemove))
            {
                
            }
            node = nextNode;
            nextNode = node.getNext();
        }while(nextNode != null);

        
        return null;
    }
}
