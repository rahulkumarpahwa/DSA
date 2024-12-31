import java.util.Scanner;

public class Input {
    // this is illustration for the input in the java.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String myString = input.nextLine();
        String myString2 = input.next();

        float myFloat = input.nextFloat();

        double myDouble = input.nextDouble();

        System.out.println(myString);
        System.out.println(myString2);
        System.out.println(number);
        System.out.println(myFloat);
        System.out.println(myDouble);

        input.close();
    }
}
