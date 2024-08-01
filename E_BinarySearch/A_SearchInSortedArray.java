package E_BinarySearch;

import java.util.Scanner;

public class A_SearchInSortedArray {
    static int searchIndex(int[] arr,int k){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] > k){
                e = mid - 1;
            }
            else if(arr[mid] < k){
                s = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
//    By recursion
    static int searchIndex1(int[] arr,int s,int e,int k){
        if(s > e) return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] > k){
            e = mid - 1;
        }
        else if(arr[mid] < k){
            s = mid + 1;
        }
        else{
            return mid;
        }
        return searchIndex1(arr,s,e,k);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the target: ");
        int n = Sc.nextInt();
        int idx = searchIndex(arr,n);
        System.out.println(idx);
        int idx1 = searchIndex1(arr,0,arr.length-1,n);
        System.out.println(idx1);
    }
}
