package D_CollctionFrameWork;
// We can not create object of any interface
import java.util.ArrayList;

public class A_CollectionDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        System.out.println(al.add("Rahul"));
        al.add(10.3f);

        System.out.println(al);

        ArrayList al1 = new ArrayList();
        al1.add(20);
        al1.add(20);
        al1.add(20);

        al.addAll(al1);
        System.out.println(al);
        System.out.println(al.contains(20));
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove("Rahul"));
        System.out.println(al.remove(1));
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(30);
        al2.add(20);
        al2.add(60);
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al.containsAll(al2));
        for(Object j : al2){
            System.out.print(j+" ");
        }
    }
}
