package C_Arrays;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class I_FourSum {
//    Brute code
    static ArrayList<ArrayList<Integer>> FourSum1(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k ++){
                    for(int l = k + 1; l < arr.length; l++){
                        if(i != j && j != k && k != l && l != i){
                            if(n == arr[i] + arr[j] + arr[k] + arr[l]){
                                ArrayList<Integer> al = new ArrayList<>();
                                al.add(arr[i]);
                                al.add(arr[j]);
                                al.add(arr[k]);
                                al.add(arr[l]);
                                Collections.sort(al);
                                if(!ans.contains(al)){
                                    ans.add(al);
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
//    Better code
//    By Hashing
    static ArrayList<ArrayList<Integer>> FourSum2(int[] arr, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int remain = n - (arr[i] + arr[j] + arr[k]);
                    if (m.get(remain) == null) {
                        continue;
                    } else {
                        int l = m.get(remain);
                        if (i != j && j != k && k != i && l != i && l != j && l != k) {
                            if (m.containsKey(remain)) {
                                ArrayList<Integer> al = new ArrayList<>();
                                al.add(arr[i]);
                                al.add(arr[j]);
                                al.add(arr[k]);
                                al.add(remain);
                                Collections.sort(al);
                                if (!ans.contains(al)) {
                                    ans.add(al);
                                }
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
//    Optimal solution
    static ArrayList<ArrayList<Integer>> FourSum3(int[] arr,int n){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j = i + 1; j < arr.length; j++){
                if(j != i + 1 && arr[j] == arr[j-1]) continue;
                int k = j + 1;
                int l = arr.length - 1;
                while(k < l){
                    int sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if(sum == n){
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(arr[k]);
                        al.add(arr[l]);
                        Collections.sort(al);
                        if(!ans.contains(al)){
                            ans.add(al);
                        }
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]) k++;
                        while(k < l && arr[l] == arr[l+1]) l++;
                    }
                    else if(sum < n) k ++;
                    else l--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the sum: ");
        int n = Sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = FourSum3(arr,n);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
