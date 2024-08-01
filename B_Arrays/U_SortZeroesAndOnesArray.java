package B_Arrays;

import java.util.Arrays;

public class U_SortZeroesAndOnesArray {
    static void sort1(int[] arr){
        int ones = 0;
        int zeroes = 0;
        for (int k : arr) {
            if (k == 1) ones += 1;
            if(k == 0) zeroes += 1;
        }
        for(int i = 0; i <arr.length; i++){
            if(zeroes > 0){
                arr[i] = 0;
                zeroes--;
                continue;
            }
            if(ones > 0){
                arr[i] = 1;
                ones--;
                continue;
            }
            arr[i] = 2;
        }
    }
//    most optimal solution
//    DUTCH NATIONAL FLAG ALGORITHM
    static void sort2(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1,0,0,1,2,1,0,0,2,1,0,2};
        int[] arr1 = new int[]{2,2,2,2,1,0,0,0,1,1,1,2,2,2,2,0,0,2,1,1,0};
        sort2(arr1);
        sort2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
