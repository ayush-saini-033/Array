package D_CollctionFrameWork;
//enumeration was introduced in jdk 1.0 version
//enumeration cursor an be used only with legacy classes i.e. vector and stack
import java.util.Enumeration;
import java.util.Vector;
public class D_EnumerationCursor {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Rahul");
        v.add(true);
        v.add(56.89f);

        System.out.println(v);

        Enumeration ev = v.elements();
        while(ev.hasMoreElements()){
            System.out.print(ev.nextElement()+" ");
        }
    }
}
