package A_Recursion;

// [1,2,3] :- subsequences must be followed the order

import java.util.ArrayList;

public class C_SubSequences {
    static void SubSeq(int idx, ArrayList<Integer> ans, int[] arr){
       if(idx == arr.length){
           System.out.println(ans);
           return;
       }
       ans.add(arr[idx]);
       SubSeq(idx+1,ans,arr);
       ans.removeLast();
       SubSeq(idx+1,ans,arr);
    }

    static void SubSeqLoop(int[] arr){
        int n = arr.length;
        int totalSubSeq = (int)Math.pow(2,n);

        for(int i = 1; i < totalSubSeq; i++){
            StringBuilder subSeq = new StringBuilder();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    subSeq.append(arr[j]).append(" ");
                }
            }
            System.out.println(subSeq);
        }
    }

    static void SubSeqStr(String str){
        int n = str.length();
        int totalSubSeq = (int)Math.pow(2,n);

        for(int i = 1; i < totalSubSeq; i++){
            StringBuilder subSeq = new StringBuilder();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    subSeq.append(str.charAt(j));
                }
            }
            System.out.println(subSeq);
        }
    }

    public static void main(String[] args) {
      int[] arr = {3,1,2};
      ArrayList<Integer> ans = new ArrayList<>();
      SubSeq(0,ans,arr);
      System.out.println();
      SubSeqLoop(arr);
      System.out.println();
      SubSeqStr("Rahul");
    }
}
