import datastructures.BinaryTrees.BinarySearchTree;
import datastructures.BinaryTrees.BinaryTree;
import datastructures.LinkedLists.CircularDoublyLinkedList;
import datastructures.LinkedLists.CircularSinglyLinkedList;
import datastructures.StacksAndQueues.MyArrayStack;
import datastructures.StacksAndQueues.MyLinkedListStack;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

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
    public static void reverseStringWithStack(String input){
        char[] newString=input.toCharArray();
        Stack<Character> reversedString=new Stack<>();

        for(int i=0; i<newString.length;i++){
            reversedString.push(newString[i]);
        }
        while (!reversedString.isEmpty()){
            System.out.println(reversedString.pop());
        }

    }



    public static void main(String[] args) {

        SumInterface sum=(int x, int y) -> System.out.println(x+y);



        Scanner getInput=new Scanner(System.in);
        System.out.println("print a word");

        String userName= getInput.nextLine();
        reverseString(userName);
        reverseStringWithStack(userName);
//
//        sum.abstractSumFun(14,26);

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

//        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.createBinaryTree();
//        System.out.println("Pre-order traversal");
//        binaryTree.preOrderRec(binaryTree.getRoot());
//        System.out.println("\n");
//        System.out.println("in-order traversal");
//        binaryTree.inOrderRec(binaryTree.getRoot());
//        System.out.println("\n");
//        System.out.println("Post-order traversal");
//        binaryTree.postOrderRec(binaryTree.getRoot());
//
//        System.out.println("\n");
//
//        System.out.println("Bst");
//
//        BinarySearchTree bst=new BinarySearchTree();
//
//        bst.insert(15);
//        bst.insert(10);
//        bst.insert(20);
//        bst.insert(8);
//        bst.insert(12);
//        bst.insert(6);
//        bst.insert(11);
//        bst.insert(17);
//        bst.insert(25);
//        bst.insert(16);
//        bst.insert(27);
//        bst.printTree();
//        System.out.println("\n");
//
//        System.out.println(bst.getSumofRange(bst.getRoot(), 6,15));
//        System.out.println(bst.altSolution(bst.getRoot(), 6,15));
//        System.out.println(bst.search(bst.getRoot(), 16));
//
        CircularSinglyLinkedList circularSinglyLinkedList=new CircularSinglyLinkedList();
        //circularSinglyLinkedList.createCircularLinkedList();

//        circularSinglyLinkedList.insertFirst(15);
//
//        circularSinglyLinkedList.insertFirst(10);
//
//        circularSinglyLinkedList.insertFirst(5);
//        circularSinglyLinkedList.insertFirst(1);


//
//        circularSinglyLinkedList.insertLast(1);
//        circularSinglyLinkedList.insertLast(5);
//        circularSinglyLinkedList.insertLast(10);
//        circularSinglyLinkedList.insertLast(15);
//        circularSinglyLinkedList.displayList();
//        System.out.println(circularSinglyLinkedList.getListSize());
//        circularSinglyLinkedList.deleteFirst();
//        circularSinglyLinkedList.displayList();
//        System.out.println(circularSinglyLinkedList.getListSize());
//
//        CircularDoublyLinkedList circularDoublyLinkedList=new CircularDoublyLinkedList();
//
//        circularDoublyLinkedList.insertLast(1);
//        circularDoublyLinkedList.insertLast(5);
//        circularDoublyLinkedList.insertLast(10);
//        circularDoublyLinkedList.insertLast(15);
//        circularDoublyLinkedList.displayList();
//        circularDoublyLinkedList.deleteLast();
//        circularDoublyLinkedList.displayList();
        MyLinkedListStack myLinkedListStack=new MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        myLinkedListStack.push(4);
        myLinkedListStack.push(5);
        while (!myLinkedListStack.isEmpty()){
            System.out.print(myLinkedListStack.pop()+" ");
        }
        System.out.println("\n");

        MyArrayStack myArrayStack= new MyArrayStack();
        myArrayStack.push(5);
        myArrayStack.push(4);
        myArrayStack.push(3);
        myArrayStack.push(2);
        myArrayStack.push(1);
        while (!myArrayStack.isEmpty()){
            System.out.print(myArrayStack.pop()+" ");
        }
        myArrayStack.push(10);
        myArrayStack.push(9);
        myArrayStack.push(8);
        myArrayStack.push(7);
        myArrayStack.push(6);
        myArrayStack.push(5);
        myArrayStack.push(4);
        myArrayStack.push(3);
        myArrayStack.push(2);
        myArrayStack.push(1);
        System.out.println(myArrayStack.isFull());










    }


}