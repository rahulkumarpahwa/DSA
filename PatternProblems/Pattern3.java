package PatternProblems;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 7;
        int trows = n;
        int stars = 1;
        for (int row = 1; row <= trows; row++) {
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= (n / 2)) {
                stars++;
            } else {
                stars--;
            }
        }

    }
}
