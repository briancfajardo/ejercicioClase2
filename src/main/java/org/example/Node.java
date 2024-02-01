package org.example;

public class Node <E>{

    private Node<E> next = null;
    private E value = null;

    public Node(E value) {
        this.value = value;

    }

    public Node<E> getNext(){
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getValue() {
        return value;
    }
}
