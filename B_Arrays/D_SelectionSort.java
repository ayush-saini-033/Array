package B_Arrays;

import java.util.Arrays;

public class D_SelectionSort {
    static void selectionSort2(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = Integer.MAX_VALUE;

            for(int j = i + 1; j < arr.length; j++){
                if (min > arr[j]){
                    min = arr[j];
                }
            }
            int idx = 0;
           for(int j = 0; j < arr.length; j++){
               if(arr[j] == min){
                   idx = j;
                   break;
               }
           }
//            swapping
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void selectionSort1(int[] arr){

        int min,temp = 0;
        for(int i = 0; i < arr.length - 1; i++){

            min = i;
            for(int j = i; j < arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
//           swapping
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void selectionStringSort(String[] arr){
        int min;
        String temp = "";
        for(int i = 0; i < arr.length - 1; i++){

            min = i;
            for(int j = i; j < arr.length; j++){
                if (arr[j].compareTo(arr[min]) < 0){
                    min = j;
                }
            }
//           swapping
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        selectionSort2(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        selectionSort1(arr2);
        System.out.println(Arrays.toString(arr2));
        String[] str = {"Anil","Rahul","Angel","Harry","Akash"};
        selectionStringSort(str);
        System.out.println(Arrays.toString(str));
    }
}
