package A_Recursion;

public class A_BasicProblems {
    static void Name(int i, int n, String name){
        if(i > n) return;
        System.out.println(name);
        Name(i+1,n,name);
    }

    static void Number1(int i, int n){
        if(i > n) return;
//        print n to 1;
        System.out.println(i);
        Number1(i+1,n);
//        print 1 to n
        System.out.println(i);
    }

    static void Number2(int n){
        if(n == 0) return;
//        print n to 1
        System.out.println(n);
        Number2(n-1);
//        print 1 to n
        System.out.println(n);
    }

    static int Sum(int n){
        if(n == 0) return 0;
        return n + Sum(n-1);
    }

    static void Sum2(int i,int n){
        if(n < 0){
            System.out.println(i);
            return;
        }
        Sum2(i+n,n-1);
    }

    static int facto(int n){
        if(n == 1 || n ==  0) return 1;
        return n*facto(n-1);
    }

    static int fibonacci1(int n){
        if(n == 1 || n == 0) return n;
        return fibonacci1(n-1) + fibonacci1(n-2);
    }

    static void fibonacci2(int ans,int f,int s,int n){
        if(n == 0){
            System.out.println(0);
            return;
        }
        if(n == 1 && f == 0 && s == 1){
            System.out.print(0 + " ");
            System.out.print(1 + " ");
            return;
        }
        if(f == 0 && s == 1){
            System.out.print(f + " ");
            System.out.print(s + " ");
        }
        if(n-1 ==0) return;
        ans = f + s;
        f = s;
        s = ans;
        System.out.print(ans +" ");
        fibonacci2(ans,f,s,n-1);
    }
    public static void main(String[] ags){
//        Name(1,5,"Rahul");
        fibonacci2(0,0,1,9);
        System.out.println();
        System.out.println(fibonacci1(9));
        System.out.println(Sum(10));
        Number2(5);
        Sum2(0,10);
    }
}

