package BitManipulation;
public class ClearIthBit {
    public static int clearIthBit(int num, int i) {
        int BitMask = ~(1 << i); // 00000001 -> 1111101 for i  = 1
        System.out.println(BitMask);
        return num & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); // 8 
    }
}
