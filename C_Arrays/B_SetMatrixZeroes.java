package C_Arrays;

import java.util.Arrays;

public class B_SetMatrixZeroes {
//    Time complexity is O(n*m(n+m))
    static void ZeroMatrix1(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 0){
                    ZeroRows(arr,i);
                    ZeroColumns(arr,j);
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    static void ZeroRows(int[][] arr,int r){
        for(int j = 0; j < arr.length; j++){
            if(arr[r][j] != 0) arr[r][j] = -1;
        }
    }
    static void ZeroColumns(int[][] arr,int c){
        for(int i = 0; i < arr[0].length; i++){
            if(arr[i][c] != 0) arr[i][c] = -1;
         }
    }
//    Brute code Time Complexity is O(2*n*m)
//    space complexity is O(n+m)
    static void ZeroMatrix2(int[][] arr) {
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{0,1,1}};
        ZeroMatrix2(arr);
        for(int i = 0; i < arr[0].length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
