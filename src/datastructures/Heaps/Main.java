package datastructures.Heaps;

public class Main {
    public static void main(String[] args) {




        Heap myHeap= new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);


        System.out.println(myHeap.getHeap());

        myHeap.insert(100);

        System.out.println(myHeap.getHeap());
        System.out.println(myHeap.getHeap());


        Heap mySecondHeap= new Heap();
        mySecondHeap.insert(95);
        mySecondHeap.insert(75);
        mySecondHeap.insert(80);
        mySecondHeap.insert(55);
        mySecondHeap.insert(60);
        mySecondHeap.insert(50);
        mySecondHeap.insert(65);


        System.out.println(mySecondHeap.getHeap());
        mySecondHeap.heapSort();

        System.out.println(mySecondHeap.getHeap());
//        mySecondHeap.removeNode();
//        System.out.println(mySecondHeap.getHeap());
//        mySecondHeap.removeNode();
//        System.out.println(mySecondHeap.getHeap());



    }
}