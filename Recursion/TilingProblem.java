package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n) {
        if (n == 1 || n == 0) { // n =1 when the size of floor is 2 x 1 then only one tile can be put and when
                                // the size is 0 then it is alos a way of not putting the tile.
            return 1;
        }

        return tilingProblem(n - 1) + tilingProblem(n - 2); // the number of ways to tile the floor is the sum of the
                                                            // ways to tile the floor of size n-1 and the ways to tile
                                                            // the floor of size n-2.
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4)); // we here passed the n in 2 x N floor size and tile size is 2 x 1.
        // Expected output is 5.
    }
}
