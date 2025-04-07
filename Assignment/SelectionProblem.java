package Assignment;
// finding the kth largest element. 

// order of understanding : 1st largest element is the largest element of all and kth largest element id smaller than it.

public class SelectionProblem {

    public static void main(String[] args) {
        int[] a = { 2, 2, 4, 6, 7, 8, 9 };
        int pos = 4; // 4th largest element.
        // find the kth largest element.
        System.out.println(kthLargestElement(a, pos));

    }

    public static int kthLargestElement(int[] a, int kth) {
        int val = -1;
        int i = 0;
        int j = a.length - 1;
        if (i < j){

        }
            

        return val;
    }
}