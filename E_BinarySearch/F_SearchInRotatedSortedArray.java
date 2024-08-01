package E_BinarySearch;

import java.util.Scanner;

public class F_SearchInRotatedSortedArray {
    static int search(int[] arr,int k){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k) return mid;
            if(arr[s] == arr[e] && arr[s] == arr[mid]){
                s = s + 1;
                e = e - 1;
                continue;
            }
//           left sorted
            if(arr[mid] >= arr[s]){
                if(arr[s] <= k && k <= arr[mid]) e = mid - 1;
                else s = mid + 1;
            }
//            right sorted
            else {
                if(arr[mid] <= k && k <= arr[e]) s = mid + 1;
                else e = mid - 1;
            }
        }
        return -1;
    }
//    does it exist in the roted sorted ARRAY
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the target: ");
        int n = Sc.nextInt();
        System.out.println(search(arr,n));
        int[] arr1 = {7,8,1,2,3,3,3,4,5,6};
//        arr[s] = arr[e] = arr[mid]
        int[] arr2 = {3,1,2,3,3,3,3};
        System.out.println(search(arr2,n));
    }
}
