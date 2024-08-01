package B_Arrays;

import java.util.Arrays;

public class I_HeapSort {
    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        I_HeapSort hs = new I_HeapSort();
        hs.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    void sort(int[] arr){
        int length = arr.length;
        for(int i = length/2 - 1; i >= 0; i--){
            heapify(arr,length,i);
        }
//        swap the elements and again heap
        for(int i = length - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }
    void heapify(int[] arr,int n,int i){
        int largest = i;
        int leftChildNodeIdx = 2*i + 1;
        int rightChildNodeIdx = 2*i + 2;

        if(leftChildNodeIdx < n && arr[leftChildNodeIdx] > arr[largest]){
            largest = leftChildNodeIdx;
        }

        if(rightChildNodeIdx < n && arr[rightChildNodeIdx] > arr[largest]){
            largest = rightChildNodeIdx;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);
        }
    }
}
