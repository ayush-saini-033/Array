package E_BinarySearch;

// minimum rate of eating bananas which comes in the deadLine
// 1.5 hrs is considered as 2 hrs
public class N_KokoEatingBananas {
    static boolean checkPoint(int[] arr,int k,int base){
        int ans = 0;
        for(int i : arr){
            float n = (float) i /k;
            if((n*10) % 10 != 0) n += 1;
            ans += (int) n;
        }
        return ans <= base;
    }
    static int minimumBanana(int[] arr,int base){
        int s = 1;
        int e = arr[arr.length-1];
        int ans = 0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(checkPoint(arr,mid,base)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int[] arr1 = {1,4,7,9,12,15};
//        System.out.println(checkPoint(arr,3,8));
        System.out.println(minimumBanana(arr1,8));
    }
}
