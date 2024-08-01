package D_CollctionFrameWork;
import java.util.Stack;

public class I_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push("Rahul");
        s.push(true);
        s.push(30.67f);
        s.push(100.67f);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search(20));
        System.out.println(s.empty());
    }
}
