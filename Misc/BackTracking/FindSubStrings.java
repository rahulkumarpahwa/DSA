public class FindSubStrings {

    public static void findSubStrings(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        //choices
        //Yes
        findSubStrings(str, ans + str.charAt(i), i + 1);
        //No
        findSubStrings(str, ans, i + 1);

    }

    public static void main(String[] args) {
        findSubStrings("abc", new String(""), 0);
    }
}