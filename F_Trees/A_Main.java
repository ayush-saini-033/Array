package F_Trees;

import java.util.Scanner;

public class A_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A_BinaryTree tree = new A_BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }
}
