package B_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class M_UnionOfTwoSortedArray {
//    Brute Force Solution
    static Integer[] union1(int[] arr1,int[] arr2){
        Set<Integer> s = new TreeSet<>();
        for(int i = 0; i < arr1.length; i++){
            s.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            s.add(arr2[i]);
        }
        Integer[] myArray = s.toArray(new Integer[0]);
        sort(myArray);
        return myArray;
    }

    static void sort(Integer[] myArray){
        boolean flag = false;
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length - i; j++){
                if (myArray[j] > myArray[j + 1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                    flag = true;
                }
                if(!flag) return;
            }
        }
    }
//    Optimal Solution
    static Integer[] union2(int[] arr1,int[] arr2){
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j] && !al.contains(arr2[i])){
                al.add(arr1[i]);
                i++;
            }
            else{
               if(!al.contains(arr2[j])){
                   al.add(arr2[j]);
               }
               j++;
            }
        }
        while(i < arr1.length){
            if(!al.contains(arr1[i])){
                al.add(arr1[i]);
            }
            i++;
        }
        while(j < arr2.length){
            if(!al.contains(arr2[j])){
                al.add(arr2[j]);
            }
            j++;
        }
        Integer[] a = al.toArray(new Integer[0]);
        sort(a);
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,4,6};
        int[] arr2 = new int[]{3,4,4,5,5,6};
        System.out.println(Arrays.toString(union2(arr1,arr2)));
    }
}
