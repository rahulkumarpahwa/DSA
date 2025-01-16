package Leetcode;

public class RotateImage {

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        reverseArray(a);
        // print matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[][] a) {
        // reverse column:
        for (int j = 0; j < a[0].length; j++) {
            int start = 0;
            int length = a.length - 1;
            while (start <= length) {
                int temp = a[start][j];
                a[start][j] = a[length][j];
                a[length][j] = temp;
                length--;
                start++;
            }
        }

        // transpose matrix:
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[0].length; j++) { // i+1 is necessary so as to make the diagonal values need not
                                                        // to be repeat again.
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }

        }
    }

}