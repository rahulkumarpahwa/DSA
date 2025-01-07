package PatternProblems;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4; // given
        int trows = n;

        for (int i = 1; i < trows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // adding a new line.
        }
    }

}
