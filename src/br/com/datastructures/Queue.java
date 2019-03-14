
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class Queue<E> {
    private int total;
    private int rear;
    private int front;
    private final Object[] queue;
    
    public Queue(int size){
        total = 0;
        front = 0;
        rear = 0;
        queue = new Object[size];
    }
    
    public boolean isEmpty(){
        return total == 0;
    }
    
    public boolean isFull(){
        return total == queue.length;
    }
    
    public void add(E element){
        if(isFull())
            throw new RuntimeException("Full Queue!!!");
        total++;
        queue[rear] = element;
        rear = (rear + 1) % queue.length;
    }
    
    public E remove(){
        if (isEmpty())
            throw new RuntimeException("Empty Queue!!!");
        total--;
        E element = (E)queue[front];
        front = (front + 1) % queue.length;
        return element;
    }

    public void printQueue(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        int idx = front;
        int pos = 0, loop = total;

        while(loop-- > 0){
            System.out.print(++pos + ". " + queue[idx].toString() + " ");
            idx = (idx + 1) % queue.length;
        }
        System.out.println("");
    }

    public void printArray(){
        for(int i = 0 ; i < queue.length ; i++){
            if (queue[i] == null)
                System.out.print(i + ". null ");
            else
                System.out.print(i + ". " + queue[i].toString() + " ");
        }
        System.out.println("");
    }

}



