package B_Arrays;

import java.util.Arrays;

public class Y_NextPermutation {
    static void nextPermutation1(int[] arr){
        if(arr == null || arr.length <= 1) return;

//        step 1: Find the longest non-increasing suffix
        int i = arr.length - 2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
//        step 2: If the entire array is non-increasing, reverse it to get the smallest permutation
        if(i >= 0){
//            step 3: Find the rightmost successor to the pivot
            int j = arr.length - 1;
            while(arr[j] <= arr[i]){
                j--;
            }
//            step 4: swap the pivot with j
            swap(arr,i,j);
        }
//        step 5: reverse the suffix
        reverse(arr,i+1,arr.length - 1);
    }
//    Helper method
    private static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//    Helper method to reverse
    private static void reverse(int[] arr,int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,4,3,0,0};
        int[] arr1 = new int[]{1,7,2,5,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        nextPermutation1(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
