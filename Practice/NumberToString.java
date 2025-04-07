public class NumberToString {

    public static void numberToString(int n, String map[]) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numberToString(n / 10, map);
        System.out.print(map[lastDigit] + " ");

    }

    public static void main(String[] args) {
        String map[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        numberToString(1997, map);
    }
}
