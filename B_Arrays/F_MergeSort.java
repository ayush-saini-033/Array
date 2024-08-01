package B_Arrays;

import java.util.Arrays;

class F_MergeSort {
    int[] arr;
    int[] tempArr;
    int length;
    public static void main(String[] args) {
        int[] arr1 = {1,2,10,-7,-45,90,56,89,200,3,-1,0};
        F_MergeSort ms = new F_MergeSort();
        ms.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public void sort(int[] inputArr){
        this.arr = inputArr;
        this.length = inputArr.length;
        this.tempArr = new int[length];
        divide(0,length-1);
    }
    public void divide(int lowerIndex,int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex)/2;
//            it will sort the left side of an array
            divide(lowerIndex,middle);

//            it will sort the right side of an array
            divide(middle+1,higherIndex);

            mergeArray(lowerIndex,middle,higherIndex);
        }
    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i = lowerIndex; i <= higherIndex; i++){
            tempArr[i] = arr[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;
        while(i <= middle && j <= higherIndex){
            if (tempArr[i] <= tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }
            else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }
}
