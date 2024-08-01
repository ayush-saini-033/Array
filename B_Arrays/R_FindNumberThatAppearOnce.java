package B_Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
public class R_FindNumberThatAppearOnce {
//    Brute code
    static Object onceAppear1(int[] arr) {
        for (int j : arr) {
            int count = 0;
            for (int k : arr) {
                if (j == k) {
                    count++;
                }
                if (count == 2) {
                    break;
                }

            }
            if (count == 1) {
                return j;
            }
        }
        return null;
    }
//    Better code By hashing
    static Object onceAppear2(int[] arr){
        int max = 0;
        for (int j : arr) {
            if (max < j) max = j;
        }
        int[] temp = new int[max + 1];
        for(int i = 0; i < arr.length; i++){
            temp[arr[i]] += 1;
        }
        for(int i = 1; i < temp.length; i ++){
            if(temp[i] == 1){
                return arr[i];
            }
        }
        return null;
    }
//    By using XOR operator
    static int onceAppear3(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        return xor;
    }
//    By using mapping
    static Object onceAppear4(int[] arr){
        Map<Integer,Integer> m = new HashMap<>();
        for (int j : arr) {
            if(m.containsKey(j)){
                m.put(j,2);
            }
            else{
                m.put(j, 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,3,4,4};
        System.out.println(onceAppear4(arr));
    }
}
