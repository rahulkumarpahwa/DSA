package Recursion.PracticeQuestions;

public class AllSubStrings {
    public static int allSubStringsNonRecur(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(allSubStringsNonRecur(str));
    }
}
