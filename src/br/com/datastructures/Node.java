
package br.com.datastructures;

/**
 *
 * @author marcio
 */
public class Node<T> {
    private T data;
    private Node next;
    
    public Node(){
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public boolean equals(Node<T> data){
        T data2Compare = (T)data.getData();
        return (this.data.equals(data2Compare));
    }
}
