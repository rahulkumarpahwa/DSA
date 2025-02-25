package BitManipulation;

public class CheckNoIsPowerOf2 {
    public static boolean checkNoIsPowerOf2(int num) {
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkNoIsPowerOf2(4));
        System.out.println(checkNoIsPowerOf2(11));
    }
}

// approach
/*
 * 1. when we see the numbers in binary formats such as :
 * 1 --> 00000001
 * 2 --> 00000010
 * 3 --> 00000011
 * 4 --> 00000100
 * then you can see that numbers which are in power of 2 have end with 0 while
 * others end with 1.
 * Now when we do the AND operation with number previous of number in power of 2
 * we got 0 always.
 * so this is the method to check that a number is in power of 2 or not.
 */
