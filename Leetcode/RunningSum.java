package Leetcode;

import java.util.ArrayList;

public class RunningSum {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(runningSum(a));
        System.out.println();
        for (int val : runningSumOptimize(a)) {
            System.out.print(val + " ");
        }
    }

    public static ArrayList<Integer> runningSum(int[] arr) { // Brute Force.
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {

                sum += arr[j];

            }
            result.add(sum);

        }
        return result;
    }

    public static int[] runningSumOptimize(int[] arr) { // optimize
        int[] result = new int[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
}
