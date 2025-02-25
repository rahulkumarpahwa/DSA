package Strings;

import java.util.*;

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char str1Array[] = str1.toCharArray();
            char str2Array[] = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            return Arrays.equals(str1Array, str2Array);
        } else {
            return false; // Strings of different lengths cannot be anagrams.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println(isAnagram(str1, str2));
        sc.close();
    }
}

/*
 * Approach :
 * 1. convert the strings to the lower case.
 * 2. check the length of the strings is equal or not.
 * 3. then if true then convert the string to the array of char.
 * 4. sort the arrays with Arrays class.
 * 5. use equals method to check that they are equal or not with the Arrays
 * class and return the result.
 */