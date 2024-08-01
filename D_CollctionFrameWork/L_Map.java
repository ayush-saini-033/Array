package D_CollctionFrameWork;
import java.util.HashMap;
import java.util.Map;

public class L_Map {
    public static void main(String[] args) {
        Map m = new HashMap();

        m.put(33,"Ayush");
        m.put(16,"Anil");
        m.put(54,"Krishnkant");
        m.put(56,"Kritika");
        m.put(56,"kritigya");

        System.out.println(m);

        System.out.println(m.containsKey(33));
        System.out.println(m.containsValue("Rahul"));
        System.out.println(m.entrySet());

        m.remove(33);
        m.replace(54,"Krishnkant","kanupriya");
        System.out.println(m);
        System.out.println(m.size());
    }
}
