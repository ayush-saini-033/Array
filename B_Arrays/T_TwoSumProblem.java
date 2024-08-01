package B_Arrays;
import java.util.*;

public class T_TwoSumProblem {
    static void sort(int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    //    Brute force code
    static ArrayList<ArrayList<Integer>> pairsSum1(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                ArrayList<Integer> al = new ArrayList<>();
                ArrayList<Integer> c = new ArrayList<>();
                if (arr[i] + arr[j] == k && i != j) {
                    al.add(i);
                    al.add(j);
                    c.add(j);
                    c.add(i);
                    if (!ans.contains(c)) {
                        ans.add(al);
                    }
                }
            }
        }
        return ans;
    }

    //    Better solution by hashing
    static boolean pairsSum2(int[] arr, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], i);
        }
        for (int a : arr) {
            int more = k - a;
            if (m.containsKey(more) && (m.get(more) != m.get(k - a))) {
                return true;
            }
        }
        return false;
    }

    //    Other method which is Two pointer method and sorted array
    static ArrayList<ArrayList<Integer>> pairsSum3(int[] arr , int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        T_TwoSumProblem.sort(arr);

        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            ArrayList<Integer> al = new ArrayList<>();
            if (arr[left] + arr[right] < k) {
                left++;
            } else if (arr[left] + arr[right] > k) {
                right--;
            }else{
                al.add(left);
                al.add(right);
                ans.add(al);
                left++;
                right--;
            }
        }
        return ans;
    }
//    other method of two pointer method
    static boolean pairsSum4(int[] arr, int k){
        T_TwoSumProblem.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum < k) left ++;
            else if (sum > k) right--;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,2,3,4,1,6,7,9};
        System.out.print("Please enter the sum: ");
        int k = Sc.nextInt();
        System.out.println(pairsSum4(arr,k));
    }
}
