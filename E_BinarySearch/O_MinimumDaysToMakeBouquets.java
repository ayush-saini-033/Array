package E_BinarySearch;

public class O_MinimumDaysToMakeBouquets {
    static boolean possibleToMake(int[] arr,int m,int k,int days){
        int no = 0;
        int count = 0;
        for (int j : arr) {
            if (days/j >= 1) count++;
            if (count == k) {
                no ++;
                count = 0;
            }
            if (days/j == 0) count = 0;
        }
        return m == no;
    }
    static int[] maxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(min > i) min = i;
            if(max < i) max = i;
        }
        return new int[]{min,max};
    }
    static int minimumDays(int[] arr,int m,int k){
        int ans = 0;
        int[] MM = new int[2];
        MM = maxMin(arr);
        int s = MM[0];
        int e = MM[1];
        while(s <= e){
            int mid = s + (e-s)/2;
            if(possibleToMake(arr,m,k,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] bloomedDay = {7,7,7,7,13,11,12,7};
        int[] arr = {3,8,5,2,9,10,14,3,12};
        int[] arr1 = {7,8,9,10,11,12,13};
//        no. of bouquets
        int m = 2;
//        no. of adjacent flowers
        int k = 3;
        System.out.println(possibleToMake(bloomedDay,m,k,13));
        System.out.println(minimumDays(bloomedDay,m,k));
        System.out.println(minimumDays(arr,m,k));
        System.out.println(minimumDays(arr1,m,k));
    }
}
