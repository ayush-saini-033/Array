package B_Arrays;

public class Q_MaximumConsecutiveOnes {
    static int onesOccur(int[] arr){
        int count = 0;
        int maxOnes = 0;
        for(int i : arr){
            if (i == 1){
                count += 1;
            }
            else{
                if(maxOnes < count){
                    maxOnes = count;
                }
                count = 0;
            }
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,0,1,1,1,0,1,1,0,0,1};
        System.out.println(onesOccur(arr));
    }
}
