package PatternProblems;

public class Pattern4 {
    public static void main(String[] args) {
        // same as pattern 3 but with numbers.
        int n = 7;
        int trows = n;
        int nums = 1;
        for (int row = 1; row <= trows; row++) {
            for (int num = 1; num <= nums; num++) {
                System.out.print(num);
            }
            System.out.println();
            if (row < n / 2 + 1) {
                nums++;
            } else {
                nums--;
            }
        }
    }
}