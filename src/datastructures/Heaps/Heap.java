package datastructures.Heaps;

import java.util.ArrayList;
import java.util.List;


public class Heap { //how to build a  Binary heap data Structure using an arraylist
    //the heap is implemented with an Arraylist to ints
    private List<Integer> heap;

    public Heap(){
        this.heap=new ArrayList<>();
    }

    public List<Integer> heapSort(){
        int n=heap.size();
        for (int i=n/2-1; i >=0; i--){
            heapify(n,i);
        }
        // One by one extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            swapNodes(0, i);

            // Call sinkNodeDown on the reduced heap
            heapify(i,0);
        }

        // Return the sorted list
        return new ArrayList<>(heap);
    }

    private int getLeftChild(int index){
        return 2*index+1;
    }

    //Prints out the heao
     public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int getRightChild(int index){
        return  2*index+2;
    }
    private int getParent(int index){
        return (index-1)/2;
    }

    private void swapNodes(int index1, int index2){// this helper method swaps the positons of 2 nodes
        int temp= heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2,temp);
    }

    public void insert(int value){//this code is actually doing 2 things
       heap.add(value);//inserts a new value at the end of the arraylist
       int current=heap.size()-1;//pointer to the last index in the arraylist we are using as the heap
        swimNodeUp(current);

    }

    public void swimNodeUp(int current){
        while (current>0 && heap.get(current)> heap.get(getParent(current))){
            // while current is greater than the root node/the starting node
            // and the child node that current is checking is larger than the parent
            swapNodes(current,getParent(current));// swap the nodes
            current=getParent(current);//then move up the child node to be the parent until the heap is re-built

        }
    }

    //to remove a node from the heap we have to remove the root node and then
    // swap one the bottom nodes(the last value in the arraylist) to make the heap compelete and then sink down the node to the bottom of the heap and re-build the max heap
    public Integer removeNode(){
        if(heap.size() ==0){
            return null;
        }

        if (heap.size() ==1){
            return heap.remove(0);
        }

        int maxValue= heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        sinkNodeDown(0);

        return maxValue;

    }

    private void sinkNodeDown(int index) {
        int maxIndex= index;
        int leftChildofIndex;
        int rightChildofIndex;

        while (true){
            leftChildofIndex=getLeftChild(index);
            rightChildofIndex=getRightChild(index);

            //the leftChildofIndex < heap.size() is used to ensure that/check if the left child index actually exists within our heap

            if(leftChildofIndex < heap.size() && heap.get(leftChildofIndex)>heap.get(maxIndex)){
                maxIndex=leftChildofIndex;
            }

            //the rightChildofIndex < heap.size() is used to ensure that/check if the right child index actually exists within our heap
            if( rightChildofIndex < heap.size() && heap.get(rightChildofIndex)>heap.get(maxIndex)){
                maxIndex=rightChildofIndex;
            }

            if (maxIndex != index){
                swapNodes(index,maxIndex);
                index=maxIndex;
            } else {
                return;
            }


        }


    }
    private void heapify (int heapSize,int index) {
        int maxIndex= index;
        int leftChildofIndex;
        int rightChildofIndex;
            leftChildofIndex=getLeftChild(index);
            rightChildofIndex=getRightChild(index);

            //the leftChildofIndex < heap.size() is used to ensure that/check if the left child index actually exists within our heap

            if(leftChildofIndex < heapSize && heap.get(leftChildofIndex) > heap.get(maxIndex)){
                maxIndex=leftChildofIndex;
            }

            //the rightChildofIndex < heap.size() is used to ensure that/check if the right child index actually exists within our heap
            if( rightChildofIndex < heapSize && heap.get(rightChildofIndex) > heap.get(maxIndex)){
                maxIndex=rightChildofIndex;
            }

            if (maxIndex != index){
                swapNodes(index,maxIndex);
                maxIndex=index;
                heapify(heapSize,maxIndex);
            }



    }



}
