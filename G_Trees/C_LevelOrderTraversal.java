package G_Trees;

import java.util.*;

public class C_LevelOrderTraversal {
    public C_LevelOrderTraversal(){

    }

    public static class Node{
        int data;
        Node left;
        Node right;

    public Node(int value){
        this.data = value;
        this.right = null;
        this.left = null;
    }
    }

    private Node root;

    public void populate(Scanner Sc){
        System.out.print("Please enter the value root node: ");
        int value= Sc.nextInt();
        root = new Node(value);
        populate(Sc,root);
    }

    public void populate(Scanner Sc, Node node){
        System.out.print("Do you like to to add new node in left of "+node.data+" : ");
        boolean left = Sc.nextBoolean();
        if(left){
            System.out.print("Please enter the value left node of "+node.data+" : ");
            int value = Sc.nextInt();
            node.left = new Node(value);
            populate(Sc,node.left);
        }
        System.out.print("Do you like to to add new node in right of "+node.data+" : ");
        boolean right = Sc.nextBoolean();
        if(right){
            System.out.print("Please enter the value right node of "+node.data+" : ");
            int value = Sc.nextInt();
            node.right = new Node(value);
            populate(Sc,node.right);
        }
    }
    public ArrayList<ArrayList<Integer>> LevelOrderTraversal(){
        return LevelOrderTraversal(this.root);
    }
    public ArrayList<ArrayList<Integer>> LevelOrderTraversal(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
//            get the size of current level
            int size = q.size();
//            create a list to store nodes at current level
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
//                get the front node in the queue
                Node node = q.poll();
//                store the node value in the current level list
//                assert node != null;
                level.add(node.data);
//                Enqueue the child nodes if they exist
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
//            store the current level
//            in the answer list
            ans.add(level);
        }
//        return the level-order
//        traversal of the tree
        return ans;
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
    public static void main(String[] args) {
        C_LevelOrderTraversal x = new C_LevelOrderTraversal();
        Scanner Sc = new Scanner(System.in);
        x.populate(Sc);
//        x.preorder();
        ArrayList<ArrayList<Integer>> ans = x.LevelOrderTraversal();
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
