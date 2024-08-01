package E_BinarySearch;

// floor arr[mid] <= k
// ceil arr[mid] >= k

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D_FloorAndCeil {
    static int floor(int[] arr,int k){
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
        return ans;
    }
    static int ceil(int[] arr,int k){
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
        return ans;
    }
    static ArrayList<Integer> boundary(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[floor(arr,k)]);
        ans.add(arr[ceil(arr,k)]);
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the target: ");
        int n = Sc.nextInt();
        int[] arr = {1,2,3,6,9,12,15,18,19,29,34,40};
        System.out.println(boundary(arr,n));
    }
}
