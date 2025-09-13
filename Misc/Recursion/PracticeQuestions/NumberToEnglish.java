package Misc.Recursion.PracticeQuestions;

public class NumberToEnglish {
    public static void numberToEnglishNonRecur(int n) {
        StringBuilder sb = new StringBuilder("");
        int tenth = 10;
        int i = 0;
        while (n > 0) {
            int last = n % tenth;
            if (last == 1) {
                sb.insert(i, " one ");
            } else if (last == 2) {
                sb.insert(i, " two ");
            } else if (last == 3) {
                sb.insert(i, " three ");
            } else if (last == 4) {
                sb.insert(i, " four ");
            } else if (last == 5) {
                sb.insert(i, " five ");
            } else if (last == 6) {
                sb.insert(i, " six ");
            } else if (last == 7) {
                sb.insert(i, " seven ");
            } else if (last == 8) {
                sb.insert(i, " eight ");
            } else if (last == 9) {
                sb.insert(i, " nine ");
            } else if (last == 0) {
                sb.insert(i, " zero ");
            }
            n = n / 10;
            i++;
        }
        System.out.println(sb);
    }

    static String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numberToEnglish(int n) { // recursive approach
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numberToEnglish(n / 10);
        System.out.print(ones[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int n = 191;
        numberToEnglishNonRecur(n);
        numberToEnglish(n);
    }
}
