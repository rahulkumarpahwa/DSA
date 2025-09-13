public class Permutations {
    public static void permutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);
            // deleting that from str and creating a new string.
            // "abcde" = "ab" + "de" = "abde" ; deleting the c character
            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutations(newStr, ans + curr);
        }

    }

    public static void main(String[] args) {
        permutations("abc", "");
    }
}