package A_Recursion;
import java.util.Arrays;

public class B_ReverseStrArr {
    static void reverseArr(int l,int r,int[] arr){
        if(l > r) return;
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        reverseArr(l+1,r-1,arr);
    }

    static char[] reverseStr(int l,int r,String name,char[] str){
        if(l == 0) str = name.toCharArray();
        if(l > r) return str;
        char temp = str[r];
        str[r] = str[l];
        str[l] = temp;
        return reverseStr(l+1,r-1,name,str);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArr(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
        String str = "Rahul Harry";
        char[] s = new char[20];
        str = new String(reverseStr(0,str.length() - 1,str,s));
        System.out.println(str);

//        This is the way to convert the character array to string
        char[] a = new char[20];
        String k = new String(a);
    }
}
