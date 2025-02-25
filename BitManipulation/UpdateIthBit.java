package BitManipulation;

public class UpdateIthBit {
    public static int updateIthBit(int num, int pos, int newBit) {
        if (newBit == 0) {
            // clear the bit:
            int BitMask = ~(1 << pos);
            return num & BitMask;
        } else {
            // set the bit:
            int BitMask = 1 << pos;
            return num | BitMask;
        }

    }

    public static int updateIthBit2ndWay(int num, int pos, int newBit) {
        num = (num & (~(1 << pos))); // clearing the bit;
        return num | (newBit << pos); // setting the newBit to the position you want to set.
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1)); // num ; index; set to 1 // 14
        System.out.println(updateIthBit(10, 1, 0)); // num ; index; clear to 0 // 8
    }

}
