package B_Arrays;

import java.util.*;

public class zzz_test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,3,2,1,2,4,5,1,1,1};
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int j : arr) {
            if (m.containsKey(j)) {
                m.replace(j, m.get(j) + 1);
            } else {
                m.put(j, 1);
            }
        }
        System.out.println(m);
    }
}
