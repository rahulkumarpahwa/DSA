package BitManipulation;

public class ClearLastIBits {

    public static int clearLastIthBits(int num, int i) {
        int BitMask = (~0) << i; // left shift the 1111111 by i positions 
        return num & BitMask;  // perform bitwise AND with the BitMask to clear the last i bits
    
    }

    public static void main(String[] args) {
        System.out.println(clearLastIthBits(15, 2)); // output : 12
    }
}
