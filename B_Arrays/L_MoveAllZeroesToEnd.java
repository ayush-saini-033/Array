package B_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class L_MoveAllZeroesToEnd {
//    Brute force code
//    time complexity  = O(2*n)
//    space complexity = 0(n)
    static  void moveZeroes1(int[] arr){
        ArrayList <Integer> temp = new ArrayList<>(arr.length);
        for(int i : arr){
            if(i != 0){
                temp.add(i);
            }
        }
        for(int i = 0; i < temp.size(); i++){
            arr[i] = temp.get(i);
        }
        for(int i = temp.size(); i < arr.length; i++){
            arr[i] = 0;
        }
    }

    static void moveZeroes2(int[] arr){
//        space complexity = O(2*n)
//        time complexity = O(2*n)
        int[] temp = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp[count] = arr[i];
                count++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

//    Optimal solution by two pointer method

    static void moveZeroes3(int[] arr){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i = j + 1; i < arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,4,0,0,6,7,0,4};
        moveZeroes3(arr);
        System.out.println(Arrays.toString(arr));
    }
}
