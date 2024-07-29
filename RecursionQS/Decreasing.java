package RecursionQS;

public class Decreasing {
    public static void main(String[] args) {
        int n = 5;
        RD(n);
    }

    public static void RD(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        RD(n - 1);
    }
}
