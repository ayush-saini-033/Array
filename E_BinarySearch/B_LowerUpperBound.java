package E_BinarySearch;

import java.util.Scanner;

public class B_LowerUpperBound {
    static int searchLowerBound1(int[] arr , int k){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(s == e) return s;
            else if(arr[mid] > k) e = mid;
            else if(arr[mid] < k) s = mid + 1;
            else{
                return mid;
            }
        }
        return -1;
    }
//    other method
    static int searchLowerBound2(int[] arr,int k){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= k){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
//    upper bound
    static int upperBound1(int[] arr,int k){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] > k){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the lower bound: ");
        int n = Sc.nextInt();
        int[] arr = {1,2,3,4,5,6,8,9,12,14,17,19};
        int idx = searchLowerBound2(arr,n);
        System.out.println(arr[idx]);
        int idx1 = upperBound1(arr,n);
        System.out.println(arr[idx1]);
    }
}
