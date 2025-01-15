package ArrayList;

import java.lang.Math;
import java.util.ArrayList;

public class InteresectArray {
    public static void main(String[] args) {
        // 1. Intersection of Arrays (application of ArrayList)

        int[] arr = { 1, 2, 3, 4 ,5 ,6 ,9 };
        int[] arr2 = { 4, 5, 6, 7, 8, 9 };
        System.out.println(IntersectArray(arr, arr2));
    }

    public static ArrayList<Integer> IntersectArray(int[] arr, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> intersect = new ArrayList<>();
        while (i < arr.length && j < arr2.length) {
            if (arr[i] < arr2[j]) {
                i++;
            } else if (arr[i] > arr2[j]) {
                j++;
            } else {
                intersect.add(arr[i]);
                i++;
                j++;
            }
        }
        return intersect;
    }
}
