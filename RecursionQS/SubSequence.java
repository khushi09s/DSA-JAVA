package RecursionQS;

public class SubSequence {
    public static void main(String[] args) {
        String ques = "abc";
        Printsubsq(ques, "");

    }

    public static void Printsubsq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        Printsubsq(ques.substring(1), ans);
        Printsubsq(ques.substring(1), ans + ch);
    }
}
