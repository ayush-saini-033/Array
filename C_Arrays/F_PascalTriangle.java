package C_Arrays;

import java.util.ArrayList;

public class F_PascalTriangle {
    static void printPascalTriangle(int rows){
        for(int i = 0; i <= rows -1; i++){
            for(int j = 1; j <= rows - i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                int n = factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    static int getPascalNumber(int r, int c){
        int res = 1;
        for(int i = 0; i < c; i++){
            res = res*(r-i);
            res = res/(i+1);
        }
        return res;
    }
    static void printNthRow(int n){
        int ans = 1;
        System.out.print(ans);
        for(int i =  1; i < n; i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans);
        }
    }
    static ArrayList<Integer> generateR(int n){
        int ans = 1;
        ArrayList<Integer> l = new ArrayList<>();
        l.add(ans);
        for(int i = 1; i < n; i++){
            ans = ans*(n-i);
            ans = ans/i;
            l.add(ans);
        }
        return l;
    }
    static ArrayList<ArrayList<Integer>> pascalTriangle(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ans.add(generateR(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        printPascalTriangle(5);
        System.out.println(getPascalNumber(3,2));
        System.out.println(getPascalNumber(2,2));
        printNthRow(5);
        System.out.println();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = pascalTriangle(5);
        for(int i = 0; i < 5; i++){
            System.out.println(ans.get(i));
        }
     }
}
