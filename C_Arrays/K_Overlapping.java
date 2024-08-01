package C_Arrays;

import java.util.ArrayList;

// Over lapping the sub intervals
public class K_Overlapping {
    static ArrayList<ArrayList<Integer>> overLapping(int[][] arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;
        int[] temp = new int[2];
        int count = 0;
        for(int k = 0; k < arr.length-1; k++){
            if(isOverlapped(arr,k,k+1)){
                count += 1;
                temp = FindMinMax(arr,k,k+1);
                arr[k+1][0] = temp[0];
                arr[k+1][1] = temp[1];
            }
//            System.out.println(Arrays.toString(temp));
            else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(temp[0]);
                al.add(temp[1]);
                if(!ans.contains(al)){
                    ans.add(al);
                }
            }
        }
        if(count % 2 != 0){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(temp[0]);
            al.add(temp[1]);
            ans.add(al);
        }
        else{
            ArrayList<Integer> al = new ArrayList<>();
            al.add(arr[arr.length-1][0]);
            al.add(arr[arr.length-1][1]);
            ans.add(al);
        }
        return ans;
    }
    static boolean isOverlapped(int[][] arr,int i,int j){
        for(int k = arr[i][0]; k <= arr[i][1]; k++){
            for(int l = arr[j][0]; l <= arr[j][1]; l++){
                if(k == l) return true;
            }
        }
        return false;
    }
    static void nestedArraySort(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j][0] > arr[j+1][0]){
                    swap(arr,j,j+1);
                } else if (arr[j][0] < arr[j+1][0]) {
                    continue;
                }else{
                    if(arr[j][1] > arr[j+1][1]){
                        swap(arr,j,j+1);
                    }
                    else{
                        continue;
                    }
                }
            }
        }
    }
    static void swap(int[][] arr, int i,int j){
        int temp = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = temp;

        int ex = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = ex;
    }
    static int[] FindMinMax(int[][]arr,int i,int j){
        int[] temp = new int[4];
        temp[0] = arr[i][0];
        temp[1] = arr[i][1];
        temp[2] = arr[j][0];
        temp[3] = arr[j][1];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] ans = new int[2];
        for(int k = 0; k < temp.length; k++){
            if(max < temp[k]){
                max = temp[k];
            }
            if(min > temp[k]){
                min = temp[k];
            }
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        int[][] arr1 = {{2,6},{1,9},{3,9},{12,20}};
        int[][] arr2 = {{7,12},{21,42},{12,19},{1,17}};
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>();
        nestedArraySort(arr2);
//        for(int i = 0; i < arr2.length; i++){
//            System.out.println(Arrays.toString(arr2[i]));
//        }
        ans1 = overLapping(arr1);
        for(int i = 0; i < ans1.size(); i++){
            System.out.println(ans1.get(i));
        }
    }
}
