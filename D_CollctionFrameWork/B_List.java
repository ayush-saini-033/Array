package D_CollctionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class B_List {
    public static void main(String[] args) {
        List l = new ArrayList();
        System.out.println(l.add(10));
        l.add(1,20);
        l.add(null);
        l.add(null);
        System.out.println(l);

        Iterator iter = l.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

        System.out.println();
        ListIterator li = l.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();
        System.out.println("---------------------");
//        move the cursor to the end so we use the while loop forward first
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println();
        li.add("Anil");
        System.out.println(l);
    }
}
