package D_CollctionFrameWork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M_HasMap {
    public static void main(String[] args) {
//        initial capacity is 16
//        default load factor is .75
        HashMap hm = new HashMap();

        hm.put(33,"Ayush");
        hm.put(16,"Anil");
        hm.put(54,"Krishnkant");
        hm.put(56,"Kritika");
        hm.put(57,"Kritika");

        System.out.println(hm);

        Set s = hm.entrySet();
        System.out.println(s);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        Iterator i = s.iterator();

        while(i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey() + "->"+entry.getValue());
        }
        System.out.println("----------------------");
//        other method
        HashMap<Integer,String> h = new HashMap<>();
        h.put(33,"Ayush");
        h.put(16,"Anil");
        h.put(54,"Krishnkant");
        h.put(56,"Kritika");
        h.put(57,"Kritika");

        for(Map.Entry me : h.entrySet()){
            System.out.println(me.getKey()+"->"+me.getValue());
        }
    }
}
