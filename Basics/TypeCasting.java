package Basics;
public class TypeCasting {
    public static void main(String[] args) {

        // implicit & explicit typecasting:
        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

        // case 1:
        // by = sh; // not possible.
        // by = in; // not possible.
        // by = lo; // not possible.

        // small can be passed to big.
        sh = by;

        // case 2:
        by = 100;

        // for (byte b = 0; b <= 128; b++) { // infinite loop : as the value of the 128
        // ( byte has a range of -128 to 127)
        // // is stored in circular overflow fashion.
        // System.out.println("Hello");
        // }

        // case 3:
        float f = 5.6f;
        double d = 6.7;
        // f= d; // not possible.
        d = f; // implicit conversion

        // case 4:
        in = (int) f; // explicit conversion.

        // byte b = 130; // can be possible as byte has a range of -128 to 127. so we
        // will do explicit typecasting.
        byte b = (byte) 130;
        System.out.println(b); // 128 -> -128 & 129 -> -127 & 130 -> -126.

        b = (byte) 380;
        System.out.println(b);

        // case 5:
        char ch = 'a';
        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);

        ch = 70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch = (char) (ch + 1);
        System.out.println(ch);

        // Practice Question :
        ch = 'a' + 1;
        ch = (char) ('a' + ch);
        System.out.println(ch); // Ã

        // Practice Question 2:
        System.out.println(10 + 20 + "Hello" + 10 + 20);
        System.out.println(2 + ' ' + 5); // ' ' is 32 in unicode value.
        System.out.println(2 + " " + 5); //  " " is a space and string, which just get concatenated.
        System.out.println("Hello" + '\t' + "World");
        System.out.println(2 + '\t' + 3); // '\t' is the tab

    }
}