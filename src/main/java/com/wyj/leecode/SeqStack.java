package com.wyj.leecode;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * 顺序栈
 * @author wangyujue
 */
public class SeqStack<T> implements Serializable {
    int top = -1;

    int capacity = 10;

    private int size;

    private T[] array;

    public SeqStack() {
        array = (T[])new Object[this.capacity];
    }

    public SeqStack(int capacity) {
        array = (T[])new Object[capacity];
    }

    public void push(T item) {
        // 判断capacity
        // 不足时候扩容
        // 满足就往数据添加数据
        if (array.length == size)
            ensureCapacity(size * 2 +1);
        array[++top] = item;
        size++;
    }

    public void ensureCapacity (int capacity) {
        if (capacity < size)
            return;

        T[] old = array;
        array = (T[])new Object[capacity];
        for (int i = 0; i < size; i++)
            array[i] = old[i];
    }

    public T pop() {
        if (isEmpty())
            new EmptyStackException();
        size--;
        return array[top--];

    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public T peek() {
        if (isEmpty())
            new EmptyStackException();
        return array[top];
    }

    public static void main(String[] args) {
        SeqStack<Integer> stack = new SeqStack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        System.out.println(stack.size);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
