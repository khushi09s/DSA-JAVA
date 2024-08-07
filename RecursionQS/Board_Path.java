package RecursionQS;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        Printans(n, 0, "");
    }

    public static void Printans(int n, int curr, String ans) {
        if (curr == n) {
            System.out.print(ans + " ");
            return;
        }
        if (curr > n) {
            return;
        }
        Printans(n, curr + 1, ans + 1);
        Printans(n, curr + 2, ans + 2);
        Printans(n, curr + 3, ans + 3);
    }
}
