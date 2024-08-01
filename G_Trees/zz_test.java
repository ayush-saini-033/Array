package G_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class zz_test {
    private int age = 19;
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);
        System.out.println(q.poll());

        q.add(100);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
    }
}
