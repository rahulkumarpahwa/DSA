package PatternProblems;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int trows = n;
        int stars = 1;
        int spaces = n - 2;
        for (int row = 1; row <= trows; row++) {
            // stars
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            // spaces
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            // stars
            int sstars = stars; // we wrote this condition so because we have to make that the stars which are
                                // print second time must print less by one when we reach the half.
            if (row == trows / 2 + 1) {
                sstars = stars - 1;
            }
            for (int star = 1; star <= sstars; star++) {
                System.out.print("*");
            }

            System.out.println();
            if (row <= trows / 2) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
        }
    }

}