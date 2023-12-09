import java.util.ArrayList;
import java.util.List;

public class Heap { //how to build a heap data Structure
    //the heap is implemented with an Arraylist to ints
    private List<Integer> heap;

    public Heap(){
        this.heap=new ArrayList<>();
    }
    private int getLeftChild(int index){
        return 2*index+1;
    }

     public List<Integer> getHeap(){
        return new ArrayList<>(heap);
    }

    private int getRightChild(int index){
        return  2*index+2;
    }
    private int getParent(int index){
        return (index-1)/2;
    }

    private void swapNodes(int index1, int index2){
        int temp= heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2,temp);
    }

    public void insert(int value){//this code is actually doing 2 things
       heap.add(value);//inserts a new value at the end of the arraylist
       int current=heap.size()-1;//pointer to the last index in the arraylist we are using as the heap
       while (current>0 && heap.get(current)> heap.get(getParent(current))){
           swapNodes(current,getParent(current));
           current=getParent(current);

       }
    }


}
