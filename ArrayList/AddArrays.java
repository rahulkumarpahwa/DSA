package ArrayList;

import java.util.ArrayList;

public class AddArrays {
    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 7 };
        int[] arr2 = { 3, 4, 4, 6 };

        System.out.println(AddArray(arr1, arr2));
    }

    public static ArrayList<Integer> AddArray(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        ArrayList<Integer> result = new ArrayList<>();
        while (i >= 0 || j >= 0) {
            int sum = 0; // either write the sum in the loop or make sure to make it zero at the end of
                         // the loop.
            if (i >= 0) {
                sum += arr1[i];

            }

            if (j >= 0) {
                sum += arr2[j];

            }

            sum += carry;
            int output = sum % 10;
            result.add(0, output);
            carry = sum / 10;
            j--;
            i--;
        }

        if (carry != 0) {
            result.add(0, carry);
        }
        return result;
    }
}
