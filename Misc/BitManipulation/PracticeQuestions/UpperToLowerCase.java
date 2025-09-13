package Misc.BitManipulation.PracticeQuestions;

public class UpperToLowerCase {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ')); // space is 32 in ascii value. so basically the space is setting a 6th
                                                 // bit from right in the upper case which makes it lower case.
        }
    }
}
