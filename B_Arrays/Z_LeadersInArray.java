package B_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//everything is smaller
//Ex:- arr[10,22,12,3,0,6]
//ans:- [22,12,6]
public class Z_LeadersInArray {
    static ArrayList<Integer> leader1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for(int j = i; j < arr.length-1; j++){
                if(arr[i] < arr[j+1]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    static ArrayList<Integer> leader2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,22,12,3,0,6,7};
        System.out.println(leader2(arr));
    }
}
