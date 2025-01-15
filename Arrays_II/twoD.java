package Arrays_II;

public class twoD {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr); // output : [[I@722c41f4

        // each column of the 2D array:
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // output:
        // [I@5b80350b
        // [I@5d6f64b1
        // [I@32a1bec0

        arr[1][3] = 34;

        // total no. of rows:
        System.out.println(arr.length);

        // total no. of columns:
        System.out.println(arr[0].length);

        // default value of element:
        System.out.println(arr[1][2]); // zero is the default value.

        // print all the values of the array:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced loop:

        for (int[] val : arr) {
            for (int i : val) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Jagged 2D-Arrays:
        int[][] arr2 = new int[3][]; // jagged Array: here we can have unequal no. of columns, for any row.
        // This is not possible: int[][] arr2 = new int[][3];

        arr2[0] = new int[3];
        arr2[1] = new int[4];
        arr2[2] = new int[2];

        // size of row of the jagged array:
        System.out.println(arr.length);

        // size of the column of jagged array will be different for the each column:
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2[2].length);

        // printing the elements of the jagged array.

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) { // for the inner loop we will use the i in the arr.
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
