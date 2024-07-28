package Arrayy;

public class Reverse_Array_Range {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 8, 7, 2, 1, 4, 5, 0, 11, 12, 13, 44, 34 };
        Reverse(arr, 3, 12);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
