package com.kkalletla;

import java.util.Set;
import java.util.TreeSet;

public class LinkedListDuplicates {

    Node<Integer> head;

    LinkedListDuplicates(){
        head = null;
    }

    public static void main(String[] args) {


        LinkedListDuplicates linkedListDuplicates = new LinkedListDuplicates();

        /*for(int i=0;i<=10;i++){
            linkedListDuplicates.insertNode(i);
        }*/

        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);
        linkedListDuplicates.insertNode(10);

        linkedListDuplicates.print();
        System.out.println("*********************************");
        linkedListDuplicates.removeDuplicates();
        linkedListDuplicates.print();

    }

    void insertNode(Integer data){

        if(head == null){
            head = new Node<>(data);
        }
        else{
            Node<Integer> iterator = head;
            while(iterator.getNext() != null){
                iterator = iterator.getNext();
            }
            iterator.setNext(new Node<>(data));
        }
    }

    void print(){

        Node<Integer> iterator = head;
        while(iterator != null){

            System.out.println(iterator.getData());
            iterator = iterator.getNext();
        }
    }

    void removeDuplicates(){
        Set<Integer> set = new TreeSet<>();

        Node<Integer> iterator = head;
        while (iterator != null){
            if(set.contains(iterator.getData())){
                try {
                    iterator.setNext(iterator.getNext().getNext());
                }catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
            else{
                set.add(iterator.getData());
                iterator = iterator.getNext();
            }
        }
    }
}
