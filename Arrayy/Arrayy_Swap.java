package Arrayy;

public class Arrayy_Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
