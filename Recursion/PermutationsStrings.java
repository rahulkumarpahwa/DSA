package Recursion;

import java.util.ArrayList;

public class PermutationsStrings {

    // we have to print all the permutations of the string in the program.

    public static void permutations(String str, boolean map[], ArrayList<Integer> ds) {

        // base case :

        if (ds.size() == str.length()) {
            System.out.println(ds);
            return;
        }

        

    }

    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();
        permutations("abc", new boolean["abc".length()], ds);

    }
}