package B_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C_RemoveDuplicatesInSortedArray {
    static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int pointer = Integer.MAX_VALUE;
        for (int j : arr) {
            if (pointer != j) {
                arrayList.add(j);
                pointer = j;
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicates(arr));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = removeDuplicates(arr);
        Object[] arr1 = arrayList.toArray();
        System.out.println(arr1[2]);
        arr1[1] = "Aysha";
        System.out.println(Arrays.toString(arr1));

        Integer[] array = arrayList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
//        not possible
//        array[0] = "Aysha";
    }
}
