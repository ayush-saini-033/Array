package E_BinarySearch;

// what is the minimum capacity which can transfer within given days
public class Q_CapacityToShipPackages {
    static boolean isPossibleCapacity(int[] arr,int days,int capacity){
        int day = 1;
        int load  = 0;
        for(int i = 0; i < arr.length; i++){
            if(load + arr[i] > capacity){
                day += 1;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return day <= days;
    }
    static int minimumCapacity(int[] arr,int days){
        int s = 1;
        int e = sum(arr);
        int ans = 0;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(isPossibleCapacity(arr,days,mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
//            System.out.println(ans);
        }
        return ans;
    }
    static int sum(int[] arr){
        int s = 0;
        for(int i : arr){
            s += i;
        }
//        System.out.println(s);
        return s;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(minimumCapacity(weights,1));
        System.out.println(minimumCapacity(weights,30));
        System.out.println(minimumCapacity(weights,3));
        System.out.println(isPossibleCapacity(weights,1,55));
    }
}
