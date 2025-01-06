public class Practice2 {
    public static void main(String[] args) {
        // fibonacci series : print the nth fibonacci element.
        int first = 0, second = 1, third = 0, nth = 5, fiboLatest = 0;

        for (int g = 1; g <= nth + 1; g++) { // note : here we add the one because fibonacci series start from the zero
                                             // and the 5th fibonacci element is in general 6th element.
            fiboLatest = third;
            System.out.println(first);
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(fiboLatest);

        // what will be output of code below?
        int i = 1, j = 1;
        while (i <= 3) {
            System.out.println("Outer Loop" + i);
            while (j <= 3) {
                if (j == 2) {
                    j++;
                    continue;
                }
                System.out.println("Inner Loop" + j);
                j++;
            }
            i++;
        }

    }
}
