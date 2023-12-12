package datastructures.Hashtables;


// based on Dinesh Varyani hashtables course
//https://youtu.be/hEPciOcibZs?si=0B-VMAQsrZq_ElhU
public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;


    public HashTable(){
        this(10);//referencing the parameterized constructor so create a hashtable of size 10 by default
    }


    //initiailize hashthable with a specific size
    public HashTable(int capacity){
        this.numOfBuckets= capacity;
        buckets=new HashNode[capacity];
    }

    private class  HashNode{ //here I am defining a Hash node class to store each bucket in a linked list whenever a collison occurs via chaining
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key =key;
            this.value=value;

        }


        @Override
        public String toString() {
            return "{" + "key =" + key + " value = "+value+ "}";
        }
    }

    public int getSize(){
        return  this.size;
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public  void put(Integer key,String value){
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while ( head != null){
            if (head.key.equals(key)){
                head.value=value;
                return;
            }
            head= head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node=new HashNode(key,value);
        node.next=head;
        buckets[bucketIndex]=node;



    }

    public String get(Integer key){ //get key
        int bucketIndex= getBucketIndex(key);//find the hash function index of the key
        HashNode head=buckets[bucketIndex];//create a new node to traverse the linked list stored at that key
        while (head != null){//keep traversring while it's not equal to null
            if(head.key.equals(key)){//if the key is found return it's value
                return head.value;
            }
            head=head.next;
        }
        return null;//if the key is not found in the hashtable
    }

    public String remove(Integer key){
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        HashNode previous= null;
        while (head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head=head.next;
        }
        if(head == null){
            return null;
        }
        size--;
        if(previous !=null){
            previous.next=head.next;
        } else{
            buckets[bucketIndex]=head.next;
        }

        String removedNodeData= head.toString();

        return removedNodeData;
    }



    //hash function to get the bucket index when adding and removing
    public  int getBucketIndex(Integer key){
        return key % buckets.length;
    }

    public  void  printTable(){
        for(int i=0; i < buckets.length; i++){
            System.out.println(i+":");
            HashNode temp=buckets[i];
            while (temp != null){
                System.out.println("  {" + temp.key+ "= "+temp.value+ "}");
                temp =temp.next;
            }
        }
    }




}
