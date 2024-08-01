package G_Trees;

import java.util.Scanner;

public class B_PreInPostOrder {
    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            this.data = val;
            this.right = null;
            this.left = null;
        }
    }

    private Node root;

    public void populate(Scanner Sc){
        System.out.print("Please enter root node value: ");
        int value = Sc.nextInt();
        root = new Node(value);
        populate(Sc,root);
    }

    public void populate(Scanner Sc, Node node){
        System.out.print("Do you want to add element in left node of "+ node.data+": ");
        boolean left = Sc.nextBoolean();
        if(left){
            System.out.print("Please enter the left value of node "+node.data+": ");
            int value = Sc.nextInt();
            node.left = new Node(value);
            populate(Sc,node.left);
        }
        System.out.print("Do you want to add element in right node of "+node.data+": ");
        boolean right = Sc.nextBoolean();
        if(right){
            System.out.print("Please enter the right value of node of "+node.data+": ");
            int value = Sc.nextInt();
            node.right = new Node(value);
            populate(Sc,node.right);
        }
    }

    public void preorder(){
        preorder(this.root);
    }

    public void preorder(Node node){
        if(node == null) return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(this.root);
    }

    public void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    public void postorder(){
        postorder(this.root);
    }

    public void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

//    Driver code or main function
    public static void main(String[] args) {
        B_PreInPostOrder x = new B_PreInPostOrder();
        Scanner Sc = new Scanner(System.in);
        x.populate(Sc);
        x.preorder();
        System.out.println();
        x.inorder();
        System.out.println();
        x.postorder();
    }
}
