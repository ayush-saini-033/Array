package D_CollctionFrameWork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class J_HashSet {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(90);
        al.add(90);
        al.add(90);
        al.add(30);

        HashSet hs = new HashSet();
        hs.add(10);
        hs.add("Rahul");
        hs.add(67.23f);
        hs.add("Anil");
        hs.add(null);
        System.out.println(hs);

        hs.addAll(al);

        Iterator itr = hs.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println(hs.contains(100));
        System.out.println(hs.size());
    }
}
