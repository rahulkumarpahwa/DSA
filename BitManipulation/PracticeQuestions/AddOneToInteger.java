package BitManipulation.PracticeQuestions;

public class AddOneToInteger {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("Adding 1 to the number " + a + " is " + -(~a));
        int b = -4;
        System.out.println("Adding 1 to the number " + b + " is " + -(~b));
        int c = 2;
        System.out.println("Adding 1 to the number " + c + " is " + -(~c));
    }
}
// approach
/*
 * when we take the NOT operator of any number then we are taking 2's complement
 * of that number which is basically inverse the bits and then add 1.
 * so just doing the NOT and the negation of it makes the increment in 1.
 * -x = ~x + 1;
 * replace ~x with x;
 * -(~x) = x + 1;
 * 
 */