package Strings;

public class StringCompression {

    public static String Compressed(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) { // the i < str.length() - 1 must be
                                                                                 // written before the other condition
                                                                                 // so as to check that the we are not
                                                                                 // at the ith element.
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdd";
        System.out.println(Compressed(str));
    }
}
