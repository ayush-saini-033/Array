package E_BinarySearch;

public class J_SingletElementInSortedArray {
    static int singleElement(int[] arr){
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];
        int s = 1;
        int e = arr.length - 2;
//        (even,odd) -> element is in right half
//        (odd,even) -> element is in left half
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) return mid;
            else if((mid % 2 != 0 && arr[mid-1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid+1])){
                s = mid + 1;
            }
            else if((mid % 2 == 0 && arr[mid] == arr[mid-1]) || (mid % 2 != 0 && arr[mid] == arr[mid+1])){
                e = mid - 1;
            }
        }
        return -1 ;
    }
//    Brute code
    static int singleElement1(int[] arr){
        int i = 0;
        for(i = 0; i < arr.length; i+=2){
            if(arr[i] != arr[i+1]){
                break;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
        System.out.println(arr[singleElement(arr)]);
    }
}
