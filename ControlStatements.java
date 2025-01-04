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

        // run at least once:
        int m = 10;
        do {
            System.out.println("hello");
        } while (m <= 9);

        // continue keyword:
        for (int d = 1; d <= 10; d++) {
            if (d > 4 && d < 9) {
                continue;
            }
            System.out.println(d);
        }

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
            n1 = n1 / 10;
        }
        System.out.println("reverse is " + rev);

        // prime no.:
        int number = 9;
        boolean prime = false;

        for (int n2 = 2; n2 <= number / 2; i++) {
            if (number % n2 == 0) {
                prime = true;
                break;
            }
        }
        if (prime) { // extra condition will be to check number must be greater than one.
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
