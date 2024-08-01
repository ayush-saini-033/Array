package B_Arrays;

import java.util.Arrays;

// Sorting is the arranging of data in the logical order
public class B_BubbleSort {

    static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    static void bubbleSort(int[] arr){
//        this for loop is for number of rounds
        for(int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length -i - 1; j++){
                if (arr[j] > arr[j+1]){
//                    swapping
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    static void bubbleStringSort(String[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length -i - 1; j++){
//                compare to methods return 1,0,-1
//                if first characters are equal then return 0
//                if first character are small then return -1
//                if first character are large then return 1
                if (arr[j].compareTo(arr[j+1]) > 0){
//                    swapping
             String temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,1,1,1};
        if (isSorted(arr3)){
            System.out.println("A Sorted Array");
        }
        else{
            System.out.println("Not a sorted array");
        }
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] str = {"Anil","Rahul","Angel","Harry","Akash"};
        bubbleStringSort(str);
        System.out.println(Arrays.toString(str));
    }
}
