package com.wyj.leecode;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * @author wangyujue
 */
public class LinkedStack<T> implements Serializable {

    private Node<T> top;

    private int size;

    public LinkedStack() {
        this.top = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T node) {
        Node<T> tNode = new Node<>(node);
        tNode.next = top;
        top =tNode;
        size++;
    }

    public T pop() {
        if (isEmpty())
            new EmptyStackException();
        T data = top.data;
        size--;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty())
            new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {

        LinkedStack linkedStack = new LinkedStack();
        System.out.println(linkedStack.isEmpty());
        System.out.println(linkedStack.size);

        linkedStack.push(1);
        System.out.println(linkedStack.size);

        linkedStack.push(2);
        System.out.println(linkedStack.size);

        Object peek = linkedStack.peek();
        System.out.println(peek);

        Object pop = linkedStack.pop();
        System.out.println(pop);

        Object pop1 = linkedStack.pop();
        System.out.println(pop1);
        System.out.println(linkedStack.isEmpty());
    }
}
