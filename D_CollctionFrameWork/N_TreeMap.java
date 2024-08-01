package D_CollctionFrameWork;
import java.util.TreeMap;

public class N_TreeMap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(33,"Ayush");
        tm.put(16,"Anil");
        tm.put(54,"Krishnkant");
        tm.put(56,"Kritika");
        tm.put(57,"Kritika");

        System.out.println(tm);
        System.out.println(tm.ceilingEntry(16));
//        provide greater and equal to the key
        System.out.println(tm.ceilingEntry(15));
//        provide lesser and equal to the key
        System.out.println(tm.floorEntry(45));

        System.out.println(tm.lastEntry());
    }
}
