package F_Trees;

public class B_Main {
    public static void main(String[] args) {
        B_BinarySearchTree tree = new B_BinarySearchTree();
        int[] arr = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(arr);
        tree.display();
    }
}
