package B_Arrays;

public class P_MissingNumber {
//    brute code
    static Object missing1(int[] arr){
        for(int i = 1; i <= arr.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length; j++ ){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if (!flag) return i;
        }
        return null;
    }
//    better code By Hash array
    static Object missing2(int[] arr){
        int[] temp = new int[arr.length + 2];
        for (int j : arr) {
            temp[j] = 1;
        }
        for(int i = 1; i < temp.length; i++){
            if(temp[i] == 0){
                return i;
            }
        }
        return null;
    }
//    Optimal Solution
    static int missing3(int[] arr){
        int n = arr.length + 1;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
//        this approach is become worst when the size of array is too long
//        like 10^5 it means 10^5*10^5 = 10^10 , required a big data type
//        but in xor of high number is not longer
        return n*(n+1)/2 - sum;
    }
//    By using xor operator
//    Note:- XOR of two same number is zero
//    for this condition is array should be sorted
    static Object missing4(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] ^ (i+1);
            if(arr[i] != 0) {
                return i+1;
            }
        }
        return null;
    }
//    Next method of XOR
//    Array should be sorted
    static Object missing5(int[] arr){
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < arr.length - 1; i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        xor1 = xor1 ^ arr.length;
        return xor1 ^ xor2;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6,7,8,9};
        System.out.println(missing5(arr));
    }
}
