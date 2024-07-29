package RecursionQS;

public class Increasing {
    public static void main(String[] args) {
        int n = 5;
        RI(n);
    }

    public static void RI(int n) {
        if (n == 0) {
            return;
        }
        RI(n - 1);
        System.out.println(n);
    }
}
