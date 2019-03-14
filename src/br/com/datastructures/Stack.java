/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.datastructures;

/**
 *
 * @author marcio
 * @param <T>
 */
public class Stack<T> {
    private int top;
    private final Object stack[];
    
    public Stack(int size){
        top = -1;
        stack = new Object[size];
    }
    
    public void push(T element){
        if (isFull())
            throw new RuntimeException("Full stack!!!");
        stack[++top] = element;
    }
    
    public T pop(){
        if (isEmpty())
            throw new RuntimeException("Empty stack!!!");
        return (T)stack[top--];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top+1 == stack.length);
    }
}
