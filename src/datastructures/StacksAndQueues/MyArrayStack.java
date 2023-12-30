package datastructures.StacksAndQueues;

import java.util.Stack;

public class MyArrayStack {
    private int top;
    private int[] arr;

    public MyArrayStack(int capacity){
        top= -1;
        arr= new int[capacity];
    }
    public MyArrayStack(){
        this(10);

    }

    public int getSize(){
        return top+1;
    }

    public boolean isEmpty(){
        return top<0;
    }
    public boolean isFull(){
        return arr.length ==getSize();
    }

    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is Full!");
        }
        top++;
        arr[top]=data;
    }

    public int pop(){
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int result =arr[top];
        top--;
        return result;
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty !!!");
        }
        return arr[top];
    }



}
