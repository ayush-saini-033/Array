package B_Arrays;

public class W_MaximumSubArraySum {
//    Better code
    static int SubArraySum1(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                if(max < sum){
                    max = sum;
                }
                sum += arr[j];
            }
        }
        return max;
    }
//    Optimal code
//    KADANE's Algorithm
    static int SubArraySum2(int[] arr){
        int sum = 0;
        int max = 0;
        int start = -1;
        int end = -1;
        for(int i = 0; i < arr.length; i++){
            if(sum == 0){
                start = i;
            }
            sum += arr[i];
            if(sum > max){
                max = sum;
                end = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("["+start+","+end+"]");
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int[] arr1 = new int[]{1,2,2,3,3,4,3,3,4,5,3,3,3};
        System.out.println(SubArraySum2(arr1));
    }
}
