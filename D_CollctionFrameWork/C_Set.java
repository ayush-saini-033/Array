package D_CollctionFrameWork;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class C_Set {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(10);
        s.add(20);
        System.out.println(s.add(30));
        s.add(10);
        s.add(null);
        s.add(0);
        s.add(false);
//        order does not matter
        System.out.println(s);

        Iterator iter = s.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
}
