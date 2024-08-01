package C_Arrays;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class G_MajorityElements3Times {
//    Brute code
    static ArrayList<Integer> majority1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) {
                    count++;
                }
                if (count > arr.length / 3) {
                    if (ans.isEmpty() || ans.getLast() != k) {
                        ans.add(k);
                    }
                    break;
                }
            }
        }
        return ans;
    }
//    Better solution
//    By Hashing technique
    static ArrayList<Integer> majority2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for (int j : arr) {
            if (m.containsKey(j)) {
                m.replace(j, m.get(j), m.get(j) + 1);
            } else {
                m.put(j, 1);
            }
        }
        for(Map.Entry<Integer,Integer> itr : m.entrySet()){
            if(itr.getValue() > arr.length/3){
                ans.add(itr.getKey());
            }
        }
        return ans;
    }
//    Optimal code
    static ArrayList<Integer> majority3(int[] arr){
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(count1 == 0 && el2 != arr[i]){
                count1 = 1;
                el1 = arr[i];
            }
            else if(count2 == 0 && el1 != arr[i]){
                count2 = 1;
                el2 = arr[i];
            }
            else if(arr[i] == el1) count1 ++;
            else if(arr[i] == el2) count2 ++;
            else{
                count1 --;
                count2 --;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(el1 == arr[i]) count1++;
            if(el2 == arr[i]) count2++;
        }
        int mini = arr.length/3 + 1;
        if(count1 >= mini) ans.add(el1);
        if(count2 >= mini) ans.add(el2);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,2,2,2};
        System.out.println(majority3(arr));
    }
}
