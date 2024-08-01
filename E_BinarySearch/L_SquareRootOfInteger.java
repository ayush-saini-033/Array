package E_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class L_SquareRootOfInteger {
    static int floorRoot(int n){
        int s = 1;
        int e = n;
        while(s <= e){
            int mid = s + (e-s)/2;
            long val = (long) mid *mid;
            if(val <= n){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return e;
    }
    static float root(int x,int n){
        float s = x;
        float e = x + 1;

        while(s <= e){
            float mid = s + (e-s)/2.0f;
            if(mid * mid <= n) s = mid + 0.01f;
            else e = mid - 0.01f;
        }
        return e;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = Sc.nextInt();
        System.out.println(floorRoot(n));
//        System.out.println(root(floorRoot(n),n));
        System.out.println(Math.sqrt(n));
        System.out.println(Integer.MAX_VALUE);
    }
}
