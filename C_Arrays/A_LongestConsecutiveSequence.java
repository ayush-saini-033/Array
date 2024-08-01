package C_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
public class A_LongestConsecutiveSequence {
//    Brute code
    static ArrayList<Integer> LCS1(int[] arr){
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            int x = arr[i];
            ArrayList<Integer> al = new ArrayList<>();
            al.add(x);
            while(find(arr,x + 1)){
                al.add(x+1);
                x++;
                count++;
            }
            if(count > max){
                max = count;
                ans = al;
            }
        }
        return ans;
    }
//    Helper method
    private static boolean find(int[] arr, int k){
        for(int j : arr){
            if(j ==  k){
                return true;
            }
        }
        return false;
    }
//    Better code
    static ArrayList<Integer> LCS2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        sort(arr);
        int max = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - 1 == lastSmaller){
                if(count == 0){
                    al.add(lastSmaller);
                }
                count++;
                lastSmaller = arr[i];
                al.add(arr[i]);
            }
            if(max < count){
                max = count;
                ans.clear();
                ans = new ArrayList<>(al);
            }
            else if(arr[i] != lastSmaller){
                count = 1;
                lastSmaller = arr[i];
                al.clear();
                al.add(arr[i]);
            }
        }
        return ans;
    }
    static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length -i - 1; j++){
                if (arr[j] > arr[j+1]){
//                    swapping
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void LCS3(int[] arr){
        Set<Integer> st = new TreeSet<>();
        int count = 1;
        int max = 0;
        for(int i : arr){
//            st.add(j);
        }
        for(int j : arr){
            if(!st.contains(j - 1)){
                while(st.contains(j + 1)){
                    j++;
                    count ++;
                }
            }
            if(max < count){
                max = count;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{102,4,100,1,101,3,2,1,1};
        int[] arr1 = new int[]{5,4,3,2,1};
        int[] arr2 = new int[]{6,5,3,2,7,3,8,9,12,3,6,0,1};
        LCS3(arr);
    }
}
