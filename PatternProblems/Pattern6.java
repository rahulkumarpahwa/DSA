package PatternProblems;

class Pattern6 {

    public static void main(String[] args) {
        int n = 4;
        for (int frow = 1; frow <= (2 * n) - 1; frow++) { // frow stands for first row.
            System.out.print("*");
        }
        System.out.println();

        int trows = n - 1; // n-1 due to first row which is direct and trivial.
        int stars = n - 1;
        int spaces = 1;

        for (int row = 1; row <= trows; row++) {

            //star
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            //spaces
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            //star
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }

            System.out.println(); // adding a new line.
            stars--;
            spaces += 2;

        }
    }
}