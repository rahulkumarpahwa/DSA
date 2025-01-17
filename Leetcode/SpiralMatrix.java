package Leetcode;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        System.out.println(spiralmatrix(a));
    }

    public static ArrayList<Integer> spiralmatrix(int[][] a) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = a.length; // row
        int n = a[0].length; // columns.
        int sr = 0;
        int er = m - 1;
        int sc = 0;
        int ec = n - 1;

        int count = m * n;
        while (count > 0) {

            // starting row
            for (int i = sc; i <=ec; i++) {
                result.add(a[sr][i]);
                count--;
            }

            sr++;
            if (count == 0)
                break;

            // end column
            for (int i = sr; i <= er; i++) {
                result.add(a[i][ec]);
                count--;
            }

            ec--;
            if (count == 0)
                break;

            // end row
            for (int i = ec; i >= sc; i--) {
                result.add(a[er][i]);
                count--;
            }

            er--;
            if (count == 0)
                break;

            // starting column
            for (int i = er; i >= sr; i--) {
                result.add(a[i][sc]);
                count--;
            }

            sc++;
            if (count == 0)
                break;

        }

        return result;

    }
}
