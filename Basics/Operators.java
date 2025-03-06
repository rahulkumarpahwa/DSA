package Basics;
public class Operators {
    public static void main(String[] args) {

        int a = 12, b = 5;
        // 1. Arithmetic operator:
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 2. Assignment Operator:
        int age;
        age = 5;
        int val = age;

        System.out.println(val);

        val += age;
        System.out.println(val);
        val -= age;
        System.out.println(val);
        val *= age;
        System.out.println(val);
        val /= age;
        System.out.println(val);
        val %= age;
        System.out.println(val);

        // 3. Relational Operator:
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 4. Logical Operator:
        System.out.println((5 > 3) && (8 > 5));
        System.out.println(5 > 3);
        System.out.println(!(5 == 3));

        // 5. Unary Operator:
        int num = 5;
        System.out.println(++num);
        int res1, res2;
        System.out.println(a);
        res1 = ++a;
        System.out.println(res1);
        res2 = --b;
        System.out.println(res2);

        // 6. ternary operator:
        // String result = 75 > 70 ? "75 is greater." : "70 is greater.";
        // System.out.println(result);

    }
}
