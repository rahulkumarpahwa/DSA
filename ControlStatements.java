public class ControlStatements {
    public static void main(String[] args) {
        // 2. Iterative Statements :

        // for loop:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Algorithms");
        }

        // while loop:
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " Hello while");
            i++;
        }

        // do-while loop:
        int j = 1;
        do {
            System.out.println(j + " Hello do while ");
            j++;
        } while (j <= 10);

        // practice question :
        // sum of n natural number:
        int sum = 0, n = 1000;
        for (int k = 1; k <= n; k++) {
            sum += k;

        }
        System.out.println("sum is " + sum);

        // reverse a number:
        int n1 = 1234, rem = 0, rev = 0;
        while (n1 != 0) {
            rem = n1 % 10;
            rev = (rev * 10) + rem;
            n1 = n1 /  10;
        }
        System.out.println("reverse is " + rev);
    }
}
