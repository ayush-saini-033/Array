package E_BinarySearch;

public class M_NthRoot {
    static int power(int num,int n,int p){
        long ans = 1;
        for(int i = 1; i <= p; i++){
            ans *= n;
            if(ans > num) return 2;
        }
        if(ans == num) return 1;
        return 0;
    }
    static int root(int n,int r){
        int s = 1;
        int e = n;
        int mid = 0;
        while(s <= e){
            mid = s + (e-s)/2;
            int midN = power(n,mid,r);
            if(midN == 1) return mid;
            else if(midN == 0) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
//        System.out.println(power(2,4));
        System.out.println(root(10000,4));
    }
}
