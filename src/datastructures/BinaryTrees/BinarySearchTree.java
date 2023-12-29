package datastructures.BinaryTrees;

public class BinarySearchTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }


    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }

    }
    public void insert(int value){
        root=insert(root,value);
    }
    // here we overload and overide the insert method
    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root =new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left=insert(root.left,value);
        }else{
            root.right=insert(root.right,value);
        }
        return root;
    }
    public void printTree(){
        inOrder(root);
    }


    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);

    }
    int sum=0;
    public int getSumofRange(TreeNode root,int low,int high){
        if(root == null){
            return 0;
        }
        getSumofRange(root.left,low,high);

        if(root.data >=low && root.data<= high){
            sum+=root.data;
        }

        System.out.println(root.data+" ");
        getSumofRange(root.right,low,high);
        return sum;



    }



    public int altSolution(TreeNode root, int low, int high){
        if (root ==null){
            return 0;
        }
        if(root.data >=low && root.data<= high){
            return root.data + altSolution(root.left,low,high)+ altSolution(root.right,low,high);
        } else if (root.data >high) {
            return altSolution(root.left,low,high);
            
        } else if (root.data < low) {
            return altSolution(root.right,low,high);

        }

        return 0;


    }





}
