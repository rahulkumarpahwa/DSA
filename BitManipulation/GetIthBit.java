package BitManipulation;

public class GetIthBit {
    public static int getIthBit(int num, int pos) {
        int BitMask = 1 << pos;
        if ((num & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3)); // 10 -> 1010
    }

}
