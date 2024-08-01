package G_Trees;

public class A_Node {
//    to store the values of nodes
    int data;
//    reference to left child node;
    A_Node left;
//    reference to right child node
    A_Node right;

//    Constructor to initialize a node with given value
    public A_Node(int key){
        data = key;
        left = null;
        right = null;
    }
//    you can make the other class for code driver
    public static void main(String[] args) {
        A_Node root = new A_Node(1);
        root.left = new A_Node(2);
        root.right = new A_Node(3);
        root.right.left = new A_Node(5);
    }
}

