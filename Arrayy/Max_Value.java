package Arrayy;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 8, 6 };
        System.out.println(Max(arr));
        System.out.println(Max1(arr));
    }

    public static int Max1(int[] arr) {
        int maaax = Integer.MIN_VALUE;// -2^31
        for (int i = 0; i < arr.length; i++) {
            // if (arr[i] > maaax) {
            //     maaax = arr[i];
            // }
            
        }
        return maaax;
    }

    public static int Max(int[] arr) {
        int maaax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maaax) {
                maaax = arr[i];
            }
        }
        return maaax;
    }
}
