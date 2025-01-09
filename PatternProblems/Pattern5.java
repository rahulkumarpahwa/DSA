package PatternProblems;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 7; // always need to be odd.
        int trows = n;
        int stars = 1;
        int spaces = n / 2;

        for (int row = 1; row <= trows; row++) {
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }

            System.out.println();
            if (row <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

        }
    }
}