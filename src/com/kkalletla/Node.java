package com.kkalletla;

public class Node<T> {

    private T data;

    Node(T data){
        this.data = data;
    }

    Node(){
    }

    private Node<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
