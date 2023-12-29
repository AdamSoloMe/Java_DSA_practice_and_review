package datastructures.LinkedLists;


import java.util.List;
import java.util.NoSuchElementException;

public class CircularDoublyLinkedList {
    private ListNode last;
    private int listSize;

    private class ListNode{

        private ListNode next;
        private ListNode prev;
        private int data;

        public  ListNode(int data){
            this.data=data;
        }

    }

    public CircularDoublyLinkedList(){
        last=null;
        listSize=0;
    }
    public int getListSize(){
        return listSize;
    }

    public boolean isEmpty(){
        return listSize ==0;
    }

    public  void createCircularLinkedList(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);

        first.prev= fourth;
        first.next=second;

        second.prev=first;
        second.next=third;

        third.prev=second;
        third.next=fourth;

        fourth.prev=third;
        fourth.next=first;

        last=fourth;

    }

    public void displayList(){
        if(last == null){
            System.out.println("list empty");
        }else {
            ListNode current = last.next;
            System.out.print("Forward Traveral:");
            while (current != last) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(current.data);

            System.out.print("Backward traversal: ");
            while (current != last.next) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println(current.data);
        }


    }
    public void insertFirst(int data){ //Prepending to the doubly Linked list
        ListNode temp=new ListNode(data);
        if(last ==null){
            last = temp;
            last.next=temp;
            last.prev=temp;
        } else{
            temp.next=last.next;
            temp.prev=last;
            last.next.prev=temp;
            last.next=temp;
        }
        listSize++;
    }

    public void insertLast(int data){//appending to the doubly Linked list
     ListNode temp=new ListNode(data);
        if(last ==null){
            last = temp;
            last.next = temp;
            last.prev = temp;
        }else{
            temp.next = last.next;
            temp.prev = last;
            last.next.prev = temp;
            last.next = temp;
            last = temp;
        }
        listSize++;

    }


    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular  Doubly  Linked List is already empty");
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
            temp.next.prev = last;
        }
        temp.next = null;
        temp.prev = null;
        listSize--;
        return temp;
    }
    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Doubly Linked List is already empty");
        }

        ListNode temp = last;

        if (last.next == last) {
            // Only one element in the list
            last = null;
        } else {
            // Move the last pointer to the previous node
            last = last.prev;
            last.next = temp.next;
            temp.next.prev = last;
        }

        temp.next = null;
        temp.prev = null;
        listSize--;

        return temp;
    }



}
//TODO:Create a New Circular Doubly Linked List With an Iterator