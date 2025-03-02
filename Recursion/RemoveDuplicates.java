package Recursion;

public class RemoveDuplicates {

    // non-recursive approach
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder("");
        boolean ch[] = new boolean[26];
        for (int i = 0; i < 26; i++) {
            ch[i] = false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!ch[str.charAt(i) - 'a']) {
                sb.append(str.charAt(i));
                ch[str.charAt(i) - 'a'] = true;
            }
        }
        return sb.toString();
    }

    // recursive approach
    public static void removeDuplicatesRecursive(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) { // true: when character already exist
            removeDuplicatesRecursive(str, idx + 1, newStr, map);
        } else { // false : when character already not exist
            map[currChar - 'a'] = true;
            removeDuplicatesRecursive(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "aaabbccdd";
        System.out.println(removeDuplicates(str));

        System.out.println("=======================recursive method================");

        removeDuplicatesRecursive(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
