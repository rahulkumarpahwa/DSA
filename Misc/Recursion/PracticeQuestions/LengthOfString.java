package Misc.Recursion.PracticeQuestions;

public class LengthOfString {
    public static void lengthOfString(String str, int i, int count) {
        if (str.length() == i) {
            System.out.println(count);
            return;
        }
        lengthOfString(str, i + 1, count + 1); // either we can use the ++count or count+1
    }

    public static void main(String[] args) {
        String str = "Hello";
        lengthOfString(str, 0, 0);
    }
}
