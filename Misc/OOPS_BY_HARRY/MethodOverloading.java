package Misc.OOPS_BY_HARRY;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(2.2f, 3.4f));
        System.out.println(c1.sum(3.4, 5.6));
        System.out.println(c1.sum(1,2,3));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
