package C_Arrays;

import java.util.Arrays;

public class C_RotateMatrix {
    private static void swap(int[][] arr,int r1, int c1,int r2,int c2){
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }
    private static void rotateRight1(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
               temp[i][j] = arr[i][j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Changing indices");
                System.out.println("("+i+","+j+")"+"->"+"("+(arr.length-1-j)+","+i+")");
                arr[i][j] = temp[arr.length-1-j][i];
            }
        }
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }
//    Helper method
    static void Transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j - i>= 0; j--){
                swap(arr,i,j,j,i);
            }
        }
    }
//    Helper method
    static void reverse(int[][] arr,int r,int s,int e){
        while(s < e){
            swap(arr,r,s,r,e);
            s++;
            e--;
        }
    }
//    Better solution
    static void rotateRight2(int[][] arr){
        Transpose(arr);
        for(int i = 0; i < arr.length; i++){
            reverse(arr,i,0, arr.length-1);
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateRight2(arr);
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
//        ans:-
//        [7,4,1]
//        [8,5,2]
//        [9,6,3]
    }
}
