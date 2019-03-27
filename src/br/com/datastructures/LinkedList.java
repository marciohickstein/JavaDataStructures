
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
        if (isEmpty()){
            System.out.println("Empty list");
            return ;
        }
        int i = 0;
        Node node = head;

        while(node != null){
            System.out.println("Index [ " + (i++) +  " ] " + node.getData().toString());
            node = node.getNext();
        }
    }

    public int size(){
        if (isEmpty()){
            return 0;
        }
        int counter = 0;

        Node node = head;

        while(node != null){
            counter++;
            node = node.getNext();
        }
        
        return counter;
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

        Node<T> node2Remove = new Node<>(data);

        Node previousNode = null, testNode = head;
        
        do 
        {
            if (testNode.equals(node2Remove))
            {
                if (previousNode == null){
                    head = null;
                }else{
                    previousNode.setNext(testNode.getNext());
                    testNode.setNext(null);
                }
                return testNode;
            }
            previousNode = testNode;
            testNode = testNode.getNext();
        }while(testNode != null);

        
        return null;
    }
}
