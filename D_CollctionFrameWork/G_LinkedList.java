package D_CollctionFrameWork;
import java.util.ArrayList;
import java.util.LinkedList;
public class G_LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.add(10);
        l1.add(20);
        l1.add("Rahul");
        l1.add(true);
        l1.add(50);
        l1.add(null);
        l1.add(null);

        System.out.println(l1);

        ArrayList al = new ArrayList();
        al.add(100);
        al.add(100);
        al.add(100);
        al.add(100);

        LinkedList l2 = new LinkedList(al);
        l2.add(200);
        l2.add(200);
        l2.add(200);
        l2.add(200);
        System.out.println(l2);

        l2.addAll(l1);
        System.out.println(l2);
    }
}
