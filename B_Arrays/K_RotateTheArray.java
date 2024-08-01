package B_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class K_RotateTheArray {
    static void Rotate1(int[] arr, int k){
//        Space complexity is O(k)
        k %= arr.length;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++){  // O(k)
            temp[i] = arr[i];
        }
        for(int i = 0; i < arr.length - k; i++){ // O(n-k)
            arr[i] = arr[i + k];
        }
        for(int i = 0; i < k; i++){  // O(k)
            arr[arr.length - k + i] = temp[i];
        }
    }

    static void Rotate2(int[] arr, int k){
        k %= arr.length;
        reverse(arr,0,k); // O(k)
        reverse(arr,k,arr.length); // O(n-k)
        reverse(arr,0, arr.length); // O(n)
    }

    static void reverse(int[] arr, int s, int e){
        int hl = (e-s)/2;
        for(int i = 0; i < hl; i++){
            int temp = arr[s+i];
            arr[s+i] = arr[e-i-1];
            arr[e-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5};
        System.out.print("Please enter the number of rotation: ");
        int k = Sc.nextInt();
        Rotate1(arr,k);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{1,2,3,4,5};
        Rotate2(arr1,k);
        System.out.println(Arrays.toString(arr1));
    }
}
