package Misc.BitManipulation;

public class EvenOrOdd {
    public static String isEvenOrOdd(int num) {
        return (num & 1) == 0 ? "Even": "Odd";
    }
    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(4));
    }
}
