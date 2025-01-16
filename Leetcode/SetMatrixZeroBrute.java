package Leetcode;

public class SetMatrixZeroBrute {
    public static void main(String[] args) {

        int[][] a = { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        boolean[][] counter = new boolean[a.length][a[0].length];

        System.out.println("Original Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    counter[i][j] = true;
                } else {
                    counter[i][j] = false;
                }

            }
        }

        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[0].length; j++) {
                if (counter[i][j] == true) {
                    int l = i;
                    for (int m = 0; m < a[0].length; m++) {
                        a[l][m] = 0;
                    }
                    int n = j;
                    for (int p = 0; p < a.length; p++) {
                        a[p][n] = 0;
                    }
                }
            }
        }


        System.out.println("Set Zero Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
