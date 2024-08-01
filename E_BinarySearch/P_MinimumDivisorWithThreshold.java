package E_BinarySearch;

public class P_MinimumDivisorWithThreshold {
    static boolean possibleDivisor(int[] arr,int th,int div){
        int ans = 0;
        for(int i : arr){
            ans += Math.ceilDiv(i,div);
        }
        return ans <= th;
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i) max = i;
        }
        return max;
    }
    static int minimumDivisor(int[] arr,int th){
        int s = 1;
        int e = max(arr);
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(possibleDivisor(arr,th,mid)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int th = 8;
        System.out.println(minimumDivisor(arr1,th));
    }
}
