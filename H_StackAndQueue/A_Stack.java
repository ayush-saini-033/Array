package H_StackAndQueue;

public class A_Stack {
    private final int maxSize;
    private final int [] arr;
    private int top;
    //    constructor
    public A_Stack(int size){
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }
    
    public void push(int el){
        if(isFull()){
            System.out.println("Stack is full. Cannot push!");
        }else{
            arr[++top] = el;
        }
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop!");
            return null;
        }else{
            return arr[top--];
        }
    }
    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }else{
            return arr[top];
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top >= maxSize - 1;
    }
    public int size(){
        return top + 1;
    }
}
