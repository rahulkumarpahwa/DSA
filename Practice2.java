public class Practice2 {
    public static void main(String[] args) {
        // fibonacci series : print the nth fibonacci element.
        int first = 0, second = 1, third = 0, nth = 5, fiboLatest = 0;

        for (int g = 2; g <= nth + 1; g++) { // note : here we add the one because fibonacci series start from the zero
                                             // and the 5th fibo element is in general 6th element.
            fiboLatest = third;
            System.out.println(first);
            third = first + second;
            first = second;
            second = third;
        }
        // System.out.println(fiboLatest);

    }
}
