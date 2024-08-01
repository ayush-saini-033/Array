package C_Arrays;

import javax.swing.*;
import java.util.*;

public class H_ThreeSum {
//    Brute Code
    static ArrayList<ArrayList<Integer>> ThreeSum1(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(i != j && j != k && i != k){
                        if(arr[i] + arr[j] + arr[k] == n){
                            ArrayList<Integer> al = new ArrayList<>();
                            al.add(arr[i]);
                            al.add(arr[j]);
                            al.add(arr[k]);
                            Collections.sort(al);
                            if(!ans.contains(al)){
                                ans.add(al);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
//    Better solution by Hashing
    static ArrayList<ArrayList<Integer>> ThreeSum2(int[] arr,int n){
        Map<Integer,Integer> m = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
           m.put(arr[j] , j);
            }

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(i != j){
                    int remain = n - arr[i] - arr[j];
                    if(m.containsKey(remain) && m.get(remain) != i && m.get(remain) != j){
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(arr[i]);
                        al.add(arr[j]);
                        al.add(remain);
                        Collections.sort(al);
                        if(!ans.contains(al)){
                            ans.add(al);
                        }
                    }
                }
            }
        }
        return ans;
    }
//    optimal solution
    static ArrayList<ArrayList<Integer>> ThreeSum3(int[] arr,int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            int j =  i + 1;
            int k = arr.length - 1;
            while(j < k){
                int sum =  arr[i] + arr[j] + arr[k];
                if(sum < n){
                    j++;
                }
                else if(sum > n){
                    k--;
                }
                else{
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    if(!ans.contains(al)){
                        ans.add(al);
                    }
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4,-3,-2};
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the sum: ");
        int n = Sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = ThreeSum3(arr,n);
        for(int i = 0; i < ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
