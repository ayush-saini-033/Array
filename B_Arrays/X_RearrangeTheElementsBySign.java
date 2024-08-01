package B_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Example:- arr[3,1,-2,-5,2,-4]
// Ans:- arr[3,-2,1,-5,2,-4]
public class X_RearrangeTheElementsBySign {
    static void rearrange1(int[] arr){
        int[] pos = new int[arr.length/2];
        int[] neg = new int[arr.length/2];
        int p = 0;
        int n = 0;
        for (int j : arr) {
            if (j >= 0) {
                pos[p] = j;
                p++;
            } else {
                neg[n] = j;
                n++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = pos[i/2];
            }
            else{
                arr[i] = neg[i/2];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange2(int[] arr){
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;
        int i = 0;
        while(pos < arr.length || neg < arr.length){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                i++;
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                i++;
                neg += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    static void rearrange3(int[] arr){
        int[] ans = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for (int j : arr) {
            if (j < 0) {
                ans[neg] = j;
                neg += 2;
            } else {
                ans[pos] = j;
                pos += 2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
//    if array should not contain equal numbers of positive and negative
    static void rearrange4(int[] arr){
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for(int i : arr){
            if( i > 0){
                pos.add(i);
            }
            else{
                neg.add(i);
            }
        }
        if(pos.size() > neg.size()){
            for(int i = 0; i < neg.size()*2; i++){
                if(i % 2 == 0){
                    arr[i] = pos.get(i/2);
                }
                else{
                    arr[i] = neg.get(i/2);
                }
            }
            for(int j = neg.size()*2; j < arr.length; j++){
                arr[j] = pos.get(j/2);
            }
        }
        else{
            for(int i = 0; i < pos.size()*2; i++){
                if(i % 2 == 0){
                    arr[i] = pos.get(i/2);
                }
                else {
                    arr[i] = neg.get(i/2);
                }
            }
            for(int j = pos.size()*2; j < arr.length; j++){
                arr[j] = neg.get(j/2);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    other way to do
    static void rearrange5(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<Integer>();
        ArrayList<Integer> neg = new ArrayList<Integer>();
        for (int i : arr) {
            if (i > 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int idx = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[idx] = pos.get(i);
                idx++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int idx = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[idx] = neg.get(i);
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,-2,-5,2,-4};
        rearrange2(arr);
        rearrange1(arr);
        rearrange3(arr);
        rearrange4(arr);
        rearrange5(arr);
    }
}
