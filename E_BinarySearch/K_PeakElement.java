package E_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class K_PeakElement {
    static ArrayList<Integer> peak1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int countA = 0;
        int countD = 0;
        for(int i = 0; i < arr.length - 2; i++){;
            if(arr[i + 1] > arr[i] && arr[i + 1]  > arr[i + 2]){
                ans.add(arr[i+1]);
            }
            if(arr[i+1] > arr[i] && arr[i+2] > arr[i+1]) countA++;
            if(arr[i+1] < arr[i] && arr[i+1] > arr[i+2]) countD ++;
        }
        if(countD == arr.length-2) ans.add(arr[0]);
        if(countA == arr.length-2) ans.add(arr[arr.length-1]);
        return ans;
    }
//    Binary search
//    for one peak
    static ArrayList<Integer> peak2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int s = 1;
        int e = arr.length - 2;
        if(arr.length == 1){
            ans.add(arr[0]);
            return ans;
        }
        if(arr[0] > arr[1]) ans.add(arr[0]);
        if(arr[arr.length-1] >arr[ arr.length-2]) ans.add(arr[arr.length-1]);
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                ans.add(arr[mid]);
                e = mid - 1;
            }
            else if(arr[mid] > arr[mid-1]) s = mid + 1;
            else s = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
//        ex:-
        int[] arr1 = {1,2,3,4,5,6,7,8,5,1};
//        peak is 8
        int[] arr2 = {1,2,1,3,5,6,4};
//        peaks are 2,6
        int[] arr3 = {1,2,3,4,5};
//        {-infinity,1,2,3,4,5,-infinity }
//        peak is 5
        int[] arr4 = {5,4,3,2,1};
//        peak is 5
        int[] arr5 = {1,2,1,3,4,7,5,6,9,7,5};
        System.out.println(peak1(arr1));
        System.out.println(peak1(arr2));
        System.out.println(peak1(arr3));
        System.out.println(peak1(arr4));
        System.out.println(peak1(arr5));

        System.out.println(peak2(arr1));
        System.out.println(peak2(arr5));
    }
}
