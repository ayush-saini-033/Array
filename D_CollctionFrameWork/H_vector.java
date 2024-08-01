package D_CollctionFrameWork;
import java.util.Vector;

public class H_vector {
    public static void main(String[] args) {
//        by default capacity is 10
        Vector v1 = new Vector();
//        by default increment is 2 times
        Vector v2 = new Vector(6);
        Vector v3 = new Vector(6,3);
        v1.add("Rahul");
        v1.add("Rahul");
        v1.add(3);
        v1.add(3);
        v1.add(1,"Anil");
        v1.remove(2);
        v1.setElementAt(10,3);

        System.out.println(v1);
        System.out.println(v1.capacity());

        v2.add(2);
        v2.add(2);
        v2.add(2);
        v2.add(2);
        v2.add(2);
        v2.add(2);
        v2.add(2);
        v2.add(2);
        System.out.println(v2.capacity());
    }
}
