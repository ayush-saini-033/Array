package B_Arrays;
import java.util.Scanner;

//Note:- sub array is the continuous pat of the array
// but Subsequence is the part of the array which maintain the relative order of elements
public class S_LongestSubArrayWithSumK {
//    Brute code
    static int subArraySum1(int[] arr,int k){
        int maxLength = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k){
                    if (maxLength < (j - i + 1)){
                        maxLength = (j - i + 1);
                    }
                }
            }
            }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter the sum of sub array: ");
        int k = Sc.nextInt();
        int[] arr = new int[]{1,1,2,2,3,4,3,2,1};
        System.out.println(subArraySum1(arr,k));
    }
}
