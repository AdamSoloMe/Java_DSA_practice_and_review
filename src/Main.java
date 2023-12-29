import datastructures.BinaryTrees.BinarySearchTree;
import datastructures.BinaryTrees.BinaryTree;

import java.util.Scanner;

interface SumInterface{
    // An abstract function
    void abstractSumFun(int x,int y);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }

}

public class Main {






    public static String reverseString(String input){
        char[] newString=input.toCharArray();
        StringBuilder sb=new StringBuilder();

        for (int i=newString.length-1; i>=0;i--){
            sb.append(newString[i]);


        }
        System.out.println(sb.toString());
        return sb.toString();
    }



    public static void main(String[] args) {

        SumInterface sum=(int x, int y) -> System.out.println(x+y);



        Scanner getInput=new Scanner(System.in);
        System.out.println("print a word");

        String userName= getInput.nextLine();
        reverseString(userName);

        sum.abstractSumFun(14,26);

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
//
//        HashTable myImprovedHashTable=new HashTable(15);
//        myImprovedHashTable.put(32,"John");
//        myImprovedHashTable.put(42,"richard");
//        myImprovedHashTable.put(42,"John");
//        myImprovedHashTable.put(42,"Willam");
//        myImprovedHashTable.put(42,"Robert");
//        myImprovedHashTable.put(56,"howard");
//        //myImprovedHashTable.printTable();
//       // System.out.println(myImprovedHashTable.remove(42));
//        myImprovedHashTable.printTable();
//
//        Graph graph=new Graph(4);
//        graph.addEdgeBetweenVertices(0,1);
//        graph.addEdgeBetweenVertices(1,2);
//        graph.addEdgeBetweenVertices(2,3);
//        graph.addEdgeBetweenVertices(3,0);
//        System.out.println(graph);

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("Pre-order traversal");
        binaryTree.preOrderRec(binaryTree.getRoot());
        System.out.println("\n");
        System.out.println("in-order traversal");
        binaryTree.inOrderRec(binaryTree.getRoot());
        System.out.println("\n");
        System.out.println("Post-order traversal");
        binaryTree.postOrderRec(binaryTree.getRoot());

        System.out.println("\n");

        System.out.println("Bst");

        BinarySearchTree bst=new BinarySearchTree();

        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(8);
        bst.insert(12);
        bst.insert(6);
        bst.insert(11);
        bst.insert(17);
        bst.insert(25);
        bst.insert(16);
        bst.insert(27);
        bst.printTree();
        System.out.println("\n");

        System.out.println(bst.getSumofRange(bst.getRoot(), 6,15));
        System.out.println(bst.altSolution(bst.getRoot(), 6,15));









    }


}