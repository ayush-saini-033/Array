package E_BinarySearch;

public class I_TimesArrayRotated {
    static int rotationCounter(int[] arr){
        int count = 0;
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= arr[s] && arr[mid] >= arr[e]){
                count++;
                s = mid + 1;
            }
            else if(arr[mid] <= arr[e] && arr[mid] <= arr[s]){
                count++;
                e = mid - 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int counter = rotationCounter(arr);
        System.out.println(counter);
    }
}
