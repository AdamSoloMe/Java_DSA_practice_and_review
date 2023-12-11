package datastructures.Hashtables;

import java.util.ArrayList;

public class BasicHashTable {
    private int size=7;
    private Node[] dataMap;


    //Node Helper inner Class
    class Node {
        private String key;
        private int value;

        private Node next;

        public Node(String key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public BasicHashTable(){
        dataMap=new Node[size];
    }


    public void  set(String key, int value){
        int index=hashFunction(key);
        Node newNode = new Node(key,value);

        if (dataMap[index]== null){
            dataMap[index]=newNode;
        }else{
            Node temp=dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next=newNode;
        }
    }

    public int get(String key) {
        int index = hashFunction(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allkeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allkeys.add(temp.key);
                temp = temp.next;
            }

        }
        return allkeys;
    }





    //example hash function

    private int hashFunction(String key){
        int hash=0;
        int asciiValue;
        char[] keyChars=key.toCharArray();
        for (int i=0; i< keyChars.length; i++){
            asciiValue=keyChars[i];
            hash=(hash + asciiValue*23) % dataMap.length;//23 is a prime number you could use any but for this case 23

        }
        return hash;
    }

    public  void  printTable(){
        for(int i=0; i <dataMap.length; i++){
            System.out.println(i+":");
            Node temp=dataMap[i];
            while (temp != null){
                System.out.println("  {" + temp.key+ "= "+temp.value+ "}");
                temp =temp.next;
            }
        }
    }



}
