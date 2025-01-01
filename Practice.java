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
        if (angle1 + angle2 + angle3 == 180 && ( angle1 > 0 && angle2 > 0 && angle3> 0)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }


        // 3. Leap Year
        System.out.println("Enter the year.");
        int year = input.nextInt();
        if ( year % 100 == 0){
            if ( year % 400 == 0 ){
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
            }
        } else {
            if ( year % 4 == 0 ){
                System.out.println("Leap Year");
            } else {
                 System.out.println("Not Leap Year");
            }
        }
         


        




        input.close();
    }
}
