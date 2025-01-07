package PatternProblems;
public class Pattern2 {
    public static void main(String[] args) {
        int n = 3;
        int trows = n;
        int spaces = n - 1; // initially
        int stars = 1; // initially.
        for (int row = 1; row <= trows; row++) {
            for (int csp = 1; csp <= spaces; csp++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;

        }
    }
}
