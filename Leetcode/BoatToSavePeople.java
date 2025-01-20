package Leetcode;

import java.util.Arrays;

public class BoatToSavePeople {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 1 };
        int limit = 3;

        System.out.println(BoatsToSavePeople(a, limit));
    }

    public static int BoatsToSavePeople(int[] a, int limit) {
        Arrays.sort(a);
        int boats = 0;
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            boats++;
            if (a[i] + a[j] <= limit) {
                i++;
            }
            j--;
        }

        return boats;
    }
}