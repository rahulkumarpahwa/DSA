package ArraysQues;

public class SearchSortedMatrix2 {
    public static boolean StairCaseAlgo2(int matrix[][], int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >=0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("value found at (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++; // going right
            } else {
                row--; // going up
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
                { 32, 33, 39, 50 }
            }; // this matrix needs to be sorted by row and column both.
        int key = 40;
        StairCaseAlgo2(matrix, key);
    }
}