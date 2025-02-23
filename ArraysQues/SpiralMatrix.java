package ArraysQues;

public class SpiralMatrix {

    public static void Spiral(int arr[][]) {
        int rowsStarts = 0;
        int rowEnds = arr.length - 1;
        int columnStart = 0;
        int columnEnds = arr[0].length - 1;
        while (rowsStarts <= rowEnds && columnStart <= columnEnds) {
            for (int i = columnStart; i <= columnEnds; i++) {
                System.out.print(arr[rowsStarts][i] + " ");
            }
            rowsStarts++;
            for (int i = rowsStarts; i <= rowEnds; i++) {
                System.out.print(arr[i][columnEnds] + " ");
            }
            columnEnds--;
            if (rowsStarts <= rowEnds) { // Check before accessing rowEnds
                for (int i = columnEnds; i >= columnStart; i--) {
                    System.out.print(arr[rowEnds][i] + " ");
                }
                rowEnds--;
            }

            if (columnStart <= columnEnds) { // Check before accessing columnStart
                for (int i = rowEnds; i >= rowsStarts; i--) {
                    System.out.print(arr[i][columnStart] + " ");
                }
                columnStart++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        Spiral(arr);
    }
}
