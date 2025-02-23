package ArraysQues;

public class SpiralMatrix2ndWay {

    public static void Spiral(int arr[][]) {
        int rowsStarts = 0;
        int rowEnds = arr.length - 1;
        int columnStart = 0;
        int columnEnds = arr[0].length - 1;
        int count = 0, total = arr.length * arr[0].length;
        while (count < total) {
            for (int i = columnStart; i <= columnEnds; i++) {
                System.out.print(arr[rowsStarts][i] + " ");
                count++;
            }
            rowsStarts++;
            for (int i = rowsStarts; i <= rowEnds; i++) {
                System.out.print(arr[i][columnEnds] + " ");
                count++;
            }
            columnEnds--;

            for (int i = columnEnds; i >= columnStart; i--) {
                System.out.print(arr[rowEnds][i] + " ");
                count++;
            }
            rowEnds--;

            for (int i = rowEnds; i >= rowsStarts; i--) {
                System.out.print(arr[i][columnStart] + " ");
                count++;
            }
            columnStart++;

        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        Spiral(arr);
    }
}
