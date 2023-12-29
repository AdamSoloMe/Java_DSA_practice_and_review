package datastructures.LinkedLists;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int listSize;

    private class ListNode{

        private ListNode next;
        private int data;

        public  ListNode(int data){
            this.data=data;
        }

    }

    public CircularSinglyLinkedList(){
        last=null;
        listSize=0;
    }
    public int getListSize(){
        return listSize;
    }

    public boolean isEmpty(){
        return listSize ==0;
    }

    public  void createSampleCircularLinkedList(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        last=fourth;

    }

    public void displayList(){
        if(last == null){
            System.out.println("list empty");
        }
        ListNode first=last.next;
        while (first != last){
            System.out.print(first.data+ " ");
            first=first.next;
        }
        System.out.println(first.data);


    }

    public void insertFirst(int data){ //Prepending to the singly Linked list
        ListNode temp=new ListNode(data);
        if(last ==null){
            last = temp;
        } else{
            temp.next=last.next;
        }
        last.next=temp;
        listSize++;
    }

    public void insertLast(int data){
        ListNode temp=new ListNode(data);
        if(last ==null){
            last=temp;
            last.next=last;
        }else{
            temp.next=last.next;
            last.next=temp;
            last=temp;
        }
        listSize++;

    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }
        ListNode temp=last.next;
        if(last.next ==last){
            last =null;
        } else{
            last.next=temp.next;
        }
        temp.next=null;
        listSize--;
        return temp;
    }

    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }

        ListNode temp = last;
        ListNode current = last.next;

        while (current.next != last) {
            current = current.next;
        }

        if (last.next == last) {
            // Only one element in the list
            last = null;
        } else {
            current.next = last.next;
            last = current;
        }

        temp.next = null;
        listSize--;

        return temp;
    }

    //TODO: Create a New Circular Singly Linked List With an Iterator

}
