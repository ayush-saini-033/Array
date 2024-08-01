package D_CollctionFrameWork;
import java.util.TreeSet;

public class K_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(10);
        ts.add(20);
        ts.add(80);
        ts.add(80);
        ts.add(90);
        ts.add(30);

        System.out.println(ts);

        TreeSet ts1 = new TreeSet();

        ts1.add("Ayush");
        ts1.add("Anil");
        ts1.add("Angel");

        System.out.println(ts1);

//        for nul value addition raise the null point exception error
    }
}
