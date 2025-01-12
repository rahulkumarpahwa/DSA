package Functions;

public class MethodOverloading {

    public static String formatNumber(int val) {
        return String.format("%d", val);
    }

    public static String formatNumber(double val) {
        return String.format("%.3f", val);
    }

    public static String formatNumber(String val) {
        return String.format("%.2f", Double.parseDouble(val));
    }

    public static void main(String[] args) {
        System.out.println(formatNumber(10));
        System.out.println(formatNumber(10.4555555577));
        System.out.println(formatNumber("550"));
    }
}