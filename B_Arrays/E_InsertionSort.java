package B_Arrays;

import java.util.Arrays;

public class E_InsertionSort {
    static void InsertionSort(int[] arr){
        int temp,j;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            j = i;
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j -= 1;
            }
            arr[j] = temp;
        }
    }

    static void InsertionStringSort(String[] arr){
        int j;
        String temp;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            j = i;
            while(j > 0 && arr[j-1].compareTo(temp) > 0){
                arr[j] = arr[j-1];
                j -= 1;
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        InsertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        String[] str = {"Anil","Rahul","Angel","Harry","Akash"};
        InsertionStringSort(str);
        System.out.println(Arrays.toString(str));
    }
}
