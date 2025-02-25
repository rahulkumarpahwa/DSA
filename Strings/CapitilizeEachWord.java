package Strings;

public class CapitilizeEachWord {
    public static String Capitilize(String str) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) { // i < str.length() - 1: This condition is crucial for
                                                                // preventing IndexOutOfBoundsException. If the space is
                                                                // the last character in the string (i.e., i is equal to
                                                                // str.length() - 1), then trying to access str.charAt(i
                                                                // + 1) (as the code does later to capitalize the next
                                                                // letter) would throw an error. This condition ensures
                                                                // that there's at least one character after the space.
                sb.append(str.charAt(i)); // appending the space into the final string
                i++; // moving to next character

                sb.append(Character.toUpperCase(str.charAt(i))); // adding the first character of the word after
                                                                 // conversion with upper case.

            } else {
                sb.append(str.charAt(i));
            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "hi, i am apple a";
        System.out.println(Capitilize(str));
    }
}
