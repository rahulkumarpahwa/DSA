// https://takeuforward.org/plus/dsa/problems/reverse-every-word-in-a-string

// brute solution: 
class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+"); // removing the multiple spaces at once.
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
