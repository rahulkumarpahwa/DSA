package Leetcode;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] given = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] transpose = new int[given.length][given[0].length];

        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[0].length; j++) {
                transpose[j][i] = given[i][j];
            }
        }
        // print matrix
        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[0].length; j++) {
                System.out.print(given[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose: ");
        for (int i = 0; i < given.length; i++) {
            for (int j = 0; j < given[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
