package BitManipulation;
public class SetIthBit {

    public static int setIthBit(int n, int i) {
        int BitMask = (1 << i);
        return n | BitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2)); // 14 // setting the 2nd bit to 1.
    }
}
