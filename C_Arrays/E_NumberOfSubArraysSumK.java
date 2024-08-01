package C_Arrays;

import java.util.*;

public class E_NumberOfSubArraysSumK {
//    Brute code
    static ArrayList<ArrayList<Integer>> subArray1(int[] arr,int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> al = new ArrayList<>();
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                al.add(arr[j]);
                if(sum == k){
                    System.out.println(al);
                    ArrayList<Integer> al1 = new ArrayList<>(al);
                    ans.add(al1);
                }
            }
        }
        return ans;
    }
    static int subArray2(int[] arr,int k){
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int preSum = 0;
        int ans = 0;
        for (int j : arr) {
            preSum += j;
            if (m.containsKey(preSum)) {
                m.replace(preSum,m.get(preSum),m.get(preSum)+1);
            } else {
               m.put(preSum,1);
            }
            int remove = preSum - k;
            if(m.containsKey(remove)){
                ans += m.get(remove);
            }
        }
        return ans;
    }
    static int subArray3(int[] arr, int k){
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (mp.containsKey(sum)) {
                mp.replace(sum, mp.get(sum), mp.get(sum) + 1);
            } else {
                mp.put(sum, 1);
            }
        }
        sum = 0;
        int ans = 0;
        for (int j : arr) {
            sum += j;
            int remove = sum - k;
            if (mp.containsKey(remove)) {
                ans += mp.get(remove);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -2, 1, 1, 1, 5, 4};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the sum: ");
        int n = Sc.nextInt();
        System.out.println(subArray2(arr,n));
        System.out.println(subArray1(arr,n));
    }
}
