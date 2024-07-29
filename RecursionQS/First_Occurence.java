package RecursionQS;

public class First_Occurence {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6, 3, 7, 3, 56, 3, 11 };
        int item = 31;
        System.out.println(occ(arr, item, 0));
    }

    public static int occ(int[] arr, int item, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == item) {
            return idx;
        }
        return occ(arr, item, idx + 1);

    }
}
