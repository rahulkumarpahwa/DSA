import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 1. Even or Odd
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int value = input.nextInt();
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        input.close();

    }
}
