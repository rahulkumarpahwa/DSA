package Strings;

import java.util.*;

public class StringCompressionSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be compressed:");
        String input = sc.next();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            Integer count = 1;
            while (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(input.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        System.out.println(sb);

        sc.close();
    }
}
