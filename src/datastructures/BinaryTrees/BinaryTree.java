package datastructures.BinaryTrees;

import java.util.Stack;

public class BinaryTree {


    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    private TreeNode root;



    private class TreeNode<T>{
        private T data; //Generic type
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data){
            this.data=data;
        }
    }


    public void createBinaryTree(){
        TreeNode first= new TreeNode<>(15);
        TreeNode second= new TreeNode<>(10);
        TreeNode thrid= new TreeNode<>(20);
        TreeNode fourth= new TreeNode<>(8);
        TreeNode fifth = new TreeNode<>(12);
        TreeNode sixth= new TreeNode<>(6);
        TreeNode seventh = new TreeNode<>(11);
        TreeNode eigth = new TreeNode<>(17);
        TreeNode ninth = new TreeNode<>(25);
        TreeNode tenth= new TreeNode<>(16);
        TreeNode eleventh = new TreeNode<>(27);

        root=first;
        first.left=second;
        first.right=thrid;
        second.left=fourth;
        second.right=fifth;
        fourth.left=sixth;
        fifth.left=seventh;
        thrid.left=eigth;
        thrid.right=ninth;
        eigth.left=tenth;
        ninth.right=eleventh;

    }

    public void  preOrderRec(TreeNode root){
        if(root ==null){

            return;
        }
        System.out.println(root.data + " ");
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    public void inOrderRec(TreeNode root){
        if (root ==null){
            return;
        }

        inOrderRec(root.left);
        System.out.println(root.data+ " ");
        inOrderRec(root.right);

    }

    public void postOrderRec(TreeNode root){
        if (root ==null){
            return;
        }

        postOrderRec(root.left);
        postOrderRec(root.right);
        System.out.println(root.data+ " ");


    }

//    public static int getSumOfValuesBetweenNodes(TreeNode root,int low,int high ){
//        if (root ==null){
//            return 0;
//        }
//        Stack<TreeNode> stack= new Stack<>();
//        TreeNode temp=root;
//        while (!stack.isEmpty() || temp !=null){
//            if(temp !=null){
//                stack.push(temp);
//                temp = temp.left;
//            } else {
//                temp = stack.pop();
//                System.out.println(temp.data+" ");
//                temp=temp.right;
//            }
//        }
//
//
//
//    }


}
//TODO: Code BST And PostOrder And InOrderTraversal
