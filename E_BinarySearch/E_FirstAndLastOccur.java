package E_BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class E_FirstAndLastOccur {
//    brute code
    static ArrayList<Integer> firstAndLast(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) {
                if(count == 0) ans.add(i);
                count++;
            }
        }
        ans.add(ans.getLast() + count - 1);
        return ans;
    }
//    optimal solution :- lower and upper bound
    static int upperBound(int[] arr,int k){
        int s = 0;
        int e = arr.length - 1;
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
        if(arr[ans] == k) return ans;
        return -1;
    }
    static int lowerBound(int[] arr,int k){
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= k){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        if(arr[ans] == k) return ans;
        return -1;
    }
    static ArrayList<Integer> firstAndLast1(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(upperBound(arr, k));
        ans.add(lowerBound(arr, k));
        return ans;
    }
    static ArrayList<Integer> firstAndLast2(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();
//        first occur
        int s = 0;
        int e = arr.length-1;
        int first = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                first = mid;
                e = mid - 1;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        ans.add(first);
        s = 0;
        e = arr.length-1;
        int second = -1;
//        second occur
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == k){
                second = mid;
                s = mid+1;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        ans.add(second);
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the target: ");
        int n = Sc.nextInt();
        int[] arr = {2,4,6,8,8,8,8,11,11,11,11,23,23,23,45};
        System.out.println(firstAndLast2(arr,n));
    }
}
