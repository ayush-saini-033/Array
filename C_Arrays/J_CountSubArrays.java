package C_Arrays;

import java.util.*;

//count sub arrays with xor k
public class J_CountSubArrays {
    static ArrayList<ArrayList<Integer>> XORSubArray1(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int xor = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = i; j < arr.length; j++){
                al.add(arr[j]);
                xor = xor ^ arr[j];
                if(xor == n){
                    ArrayList<Integer> al1 = new ArrayList<>(al);
//                    Collections.sort(al1);
                    if(!ans.contains(al1)){
                        ans.add(al1);
                    }
                }
            }
        }
        return ans;
    }
    static int XORSubArray2(int[] arr,int n){
        int xor = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int count = 0;
        for (int j : arr) {
            xor ^= j;
            if( xor == n){
                count++;
            }
            if(m.containsKey(xor^n)){
                count += m.get(xor^n);
            }
            m.put(xor,m.getOrDefault(xor,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the XOR value: ");
        int n = Sc.nextInt();
        int[] arr = {4,2,2,6,4};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = XORSubArray1(arr,n);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
        System.out.println(XORSubArray2(arr,n));
    }
}
