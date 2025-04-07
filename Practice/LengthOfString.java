public class LengthOfString {
    public static void lengthOfString(String str, int i) {
        if (i == str.length()) {
            System.out.println(i);
            return;
        }
        lengthOfString(str, i + 1);

    }

    public static void main(String[] args) {
lengthOfString("Apple", 0);
    }
}
