package B_Arrays;

import java.util.HashMap;
import java.util.Map;

//Time complexity of mp is NlogN
public class V_MajorityElement {
//    Brute code
    static int majority1(int[] arr){
        int max = Integer.MIN_VALUE;
        int el = 0;
        for(int i : arr){
            int count = 0;
            for(int j : arr){
                if(i == j){
                    count++;
                }
            }
            if(max < count){
                max = count;
                el = i;
            }
        }
        if(max > arr.length/2){
            return el;
        }
        return -1;
    }
//    Better code by hashing
    static int majority2(int[] arr){
        Map<Integer,Integer> m = new HashMap<>();
        //Time complexity of mp is NlogN
        for (int j : arr) {
            if (m.containsKey(j)) {
                m.replace(j, m.get(j) + 1);
            } else {
                m.put(j, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int el = 0;
        for(Map.Entry<Integer,Integer> me : m.entrySet()){
            if(max < me.getValue()){
                max = me.getValue();
                el = me.getKey();
            }
        }
        if(max > arr.length/2){
            return el;
        }
        return -1;
    }
//    Optimal solution
//    Most Voting Algorithm
    static int majority3(int[] arr){
        int count = 0;
        int el = 0;
        for (int j : arr) {
            if (count == 0) {
                count = 1;
                el = j;
            } else if (j == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for(int i : arr){
            if(i == el) count1++;
        }
        if(count1 > arr.length/2) return el;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,3,2,1,2,4,5,1,1,1,1,1,2,2};
        int[] arr1 = new int[]{1,2,2,3,3,4,3,3,4,5,3,3,3};
        System.out.println(majority3(arr1));
    }
}
