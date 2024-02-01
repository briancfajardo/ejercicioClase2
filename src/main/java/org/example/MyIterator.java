package org.example;

import java.util.Iterator;

public class MyIterator <E> implements Iterator {

    private Node<E> next = null;

    public MyIterator(Node<E> n){
        next = n;
    }


    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public E next() {
        Node<E> currentNext = next;
        next = currentNext.getNext();
        return currentNext.getValue();
    }

    @Override
    public void remove() {

    }

}
