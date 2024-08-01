package B_Arrays;

import java.util.Arrays;

class G_QuickSort {
    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        int length = arr1.length;
        G_QuickSort qs = new G_QuickSort();
        qs.quickSortRecursion(arr1,0,length-1);
        System.out.println(Arrays.toString(arr1));
    }
    int partition(int[] arr,int low,int high){
//        int pivot = arr[low]; also work
        int pivot = arr[(low+high)/2];

        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high --;
            }if (low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
               arr[high] = temp;
               low++;
               high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int[] arr,int low,int high){
        int pi = partition(arr,low,high);
        if (low < pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if (pi < high){
            quickSortRecursion(arr,pi,high);
        }
    }
}
