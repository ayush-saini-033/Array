package H_StackAndQueue;

public class A_StackUsingArray{
    public static void main(String[] args) {
        A_Stack s = new A_Stack(4);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(0);

        System.out.println(s.pop());
    }
}

