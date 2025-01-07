import java.util.Scanner;

// This file illustrates the list of practice questions for the java.
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

        // 2. Valid/Invalid Triangle.
        System.out.println("Enter first angle");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle");
        int angle3 = input.nextInt();
        if (angle1 + angle2 + angle3 == 180 && (angle1 > 0 && angle2 > 0 && angle3 > 0)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        // 3. Leap Year
        System.out.println("Enter the year.");
        int year = input.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        }

        // In optimize way:
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }

        // 4. Max of three:
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greatest.");
        } else if (b > c) {
            System.out.println(b + " is greatest.");
        } else {
            System.out.println(c + " is greatest.");
        }

        // 5. Given three sides of the triangle and check that it is equilateral,
        // isosceles or scalene.

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        if (side1 > 0 || side2 > 0 || side3 > 0) {

            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("It is Equilateral Triangle.");
            } else if (side1 != side2 && side2 != side3 && side3 != side1) {
                System.out.println("It is Scalene Triangle.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("It is Isosceles Triangle.");
            }

        } else {
            System.out.println("The Sides must be greater than 0.");
        }

        // 6. consonant or vowel of the given alphabet.
        // 7. day based on the week no. given. between 1 to 7.

        input.close();
    }
}
