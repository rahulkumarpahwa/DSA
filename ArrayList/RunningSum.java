package ArrayList;

import java.util.ArrayList;

public class RunningSum {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(runningSum(a));
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
}
