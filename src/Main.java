import datastructures.Graph;
import datastructures.Hashtables.BasicHashTable;
import datastructures.Hashtables.HashTable;
import datastructures.Heaps.Heap;

public class Main {
    public static void main(String[] args) {


//
//
//        Heap myHeap= new Heap();
//        myHeap.insert(99);
//        myHeap.insert(72);
//        myHeap.insert(61);
//        myHeap.insert(58);
//
//
//        System.out.println(myHeap.getHeap());
//
//        myHeap.insert(100);
//
//        System.out.println(myHeap.getHeap());
//        System.out.println(myHeap.getHeap());
//
//
//        Heap mySecondHeap= new Heap();
//        mySecondHeap.insert(95);
//        mySecondHeap.insert(75);
//        mySecondHeap.insert(80);
//        mySecondHeap.insert(55);
//        mySecondHeap.insert(60);
//        mySecondHeap.insert(50);
//        mySecondHeap.insert(65);
//
//
//        System.out.println(mySecondHeap.getHeap());
//        mySecondHeap.heapSort();
//
//        System.out.println(mySecondHeap.getHeap());
////        mySecondHeap.removeNode();
////        System.out.println(mySecondHeap.getHeap());
////        mySecondHeap.removeNode();
////        System.out.println(mySecondHeap.getHeap());
////        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
////        pq.
//
//        BasicHashTable myHashTable= new BasicHashTable();
//        //myHashTable.printTable();
//
//        myHashTable.set("nails",100);
//        myHashTable.set("tile",50);
//        myHashTable.set("lumber",80);
//
//        myHashTable.set("bolts",200);
//        myHashTable.set("screws", 140);
//        myHashTable.printTable();
//        System.out.println(myHashTable.keys());
       // System.out.println(myHashTable.get("nails"));

        HashTable myImprovedHashTable=new HashTable(15);
        myImprovedHashTable.put(32,"John");
        myImprovedHashTable.put(42,"richard");
        myImprovedHashTable.put(42,"John");
        myImprovedHashTable.put(42,"Willam");
        myImprovedHashTable.put(42,"Robert");
        myImprovedHashTable.put(56,"howard");
        //myImprovedHashTable.printTable();
       // System.out.println(myImprovedHashTable.remove(42));
        myImprovedHashTable.printTable();

        Graph graph=new Graph(4);
        graph.addEdgeBetweenVertices(0,1);
        graph.addEdgeBetweenVertices(1,2);
        graph.addEdgeBetweenVertices(2,3);
        graph.addEdgeBetweenVertices(3,0);
        System.out.println(graph);






    }
}