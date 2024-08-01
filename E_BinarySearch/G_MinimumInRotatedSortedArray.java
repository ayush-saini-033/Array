package E_BinarySearch;

public class G_MinimumInRotatedSortedArray {
    static int minimum(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        int min =Integer.MAX_VALUE;
        while(s <= e){
            int mid = s + (e-s)/2;
//            left sorted
//            this condition is valid only when all elements are distinct
            if(arr[s] == arr[e]){
                while(arr[s] == arr[e]){
                    s++;
                    e--;
                }
            }
            if(arr[s] <= arr[e] && arr[s] <= arr[mid]){
                if(min > arr[s]) min = arr[s];
                break;
            }
            if(arr[mid] >= arr[s]){
                if(min > arr[s]) min = arr[s];
                s = mid + 1;
            }
//            right sorted
            else{
                if(min > arr[mid]) min = arr[mid];
                e = mid - 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        int[] arr1 = {1,2,3,6,9,20,19,15,11};
        int[] arr2 = {3,4,5,6,1,2,3};
        int[] arr3 = {6,6,6,5,4,3,2,9,8,8,7,6,6};
        int min = minimum(arr3);
        System.out.println(min);
    }
}
