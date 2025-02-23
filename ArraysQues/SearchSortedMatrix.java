package ArraysQues;

public class SearchSortedMatrix {

    public static boolean StairCaseAlgo(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col > 0) {
            if (matrix[row][col] == key) {
                System.out.println("value found at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                row++; // going bottom
            } else {
                col--; // going left
            }
        }
        System.out.println("Can't found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } }; // this matrix needs to be sorted by row and column both.
        int key = 100;
        StairCaseAlgo(matrix, key);
    }
}
