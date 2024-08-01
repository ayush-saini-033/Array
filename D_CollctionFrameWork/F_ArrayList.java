package D_CollctionFrameWork;

import java.util.ArrayList;

public class F_ArrayList {
    public static void main(String[] args) {
//        initial capacity is 10 which is by default
        ArrayList al1 = new ArrayList();
//        initial capacity is 6
        ArrayList al2 = new ArrayList(6);
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(4,50);
        al1 = new ArrayList(al2);
        System.out.println(al1);
        ArrayList al3 =  new ArrayList();
//        al3 and al2 having same pointer
        al3 = al2;
        System.out.println(al3);
        al3.remove(1);
        System.out.println(al2);
        al2.remove(0);
        System.out.println(al3);
        System.out.println(al2.get(0));
        al2.set(0,99);
        System.out.println(al2);
        System.out.println(al3.indexOf(100));
    }
}
