package com.wyj.leecode;

/**
 * @author wangyujue
 */
public class Node<T> {

    public Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(Node<T> next, T data) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return this.data;
    }
}
