package B_Arrays;

import java.util.Arrays;

public class A_Largest {
    static int largest1(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j ++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }

    static int largest2(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    static Object secondLargest1(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                }
            }
        }
        for(int i = arr.length - 1; i > 0; i--){
            if (arr[i] != arr[i - 1]){
                return arr[i - 1];
            }
        }
        return null;
    }

    static Object secondLargest2(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];

        for(int i : arr){
            if (i > max1){
                max1 = i;
            }
        }

        for(int j : arr){
            if (j > max2 && j != max1){
                max2 = j;
            }
        }
        if (max2 != max1){
            return max2;
        }
        return "No second largest";
    }

    static Object secondSmallest1(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i : arr){
            if (i < min1){
                min1 = i;
            }
        }

        for(int j : arr){
            if (j < min2 && j != min1){
                min2 = j;
            }
        }
        if (min2 == Integer.MIN_VALUE){
            return "No second smallest";
        }
        else {
            return min2;
        }
    }

    static Object secondSmallest2(int[] arr){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;

        for(int i : arr){
            if (i < smallest){
                sSmallest = smallest;
                smallest = i;
            }
            else if (i != smallest && i < sSmallest){
                sSmallest = i;
            }
        }
        if (sSmallest == Integer.MAX_VALUE){
            return "No second smallest";
        }
        else{
            return sSmallest;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{5,4,3,2,1,9,15,18,-4};
        int[] arr2 = new int[5];
        arr2 = new int[]{6,7,8,9,10};
        int[] arr3 = {7,7,7,7,7};
        int[] arr4 = {1,7,7,7,7};
        int[] arr5 = {5,4,3,8,-3,5,-3};
        System.out.println(largest1(arr1));
        System.out.println(largest2(arr1));
        System.out.println(secondLargest2(arr1));
        System.out.println(secondLargest1(arr3));
        System.out.println(secondLargest2(arr3));
        System.out.println(secondLargest2(arr4));
        System.out.println(Arrays.toString(arr1));
        System.out.println(secondSmallest1(arr1));
        System.out.println(secondSmallest2(arr1));
    }
}
