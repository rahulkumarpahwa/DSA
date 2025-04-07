// problem no. : 167 leetcode

package Leetcode;

import java.util.ArrayList;

public class twoSum {

    public static void main(String[] args) {
        int[] a = { 2, 7, 11, 15 };
        int target = 18;
        System.out.println(findTwoSum(a, target));
        System.out.println(findTwoSumOptimize(a, target));
    }

    public static ArrayList<Integer> findTwoSum(int[] a, int target) { // brute force.
        ArrayList<Integer> result = new ArrayList<>();
        // possible in the both sorted and unsorted array.

        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            while (j < a.length) {
                if (a[i] + a[j] == target) {
                    result.add(i + 1);
                    result.add(j + 1);
                }
                j++;
            }
        }

        return result;
    }

    public static ArrayList<Integer> findTwoSumOptimize(int[] a, int target) { // optimize
        ArrayList<Integer> result = new ArrayList<>();
        // possible in the sorted array only.

        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] + a[j] == target) {
                result.add(i + 1);
                result.add(j + 1);
                return result;
            } else if (a[i] + a[j] > target) {
                j--;
            } else if (a[i] + a[j] < target) {
                i++;
            }

        }

        return result;
    }
}