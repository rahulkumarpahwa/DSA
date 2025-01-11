package Functions;

public class Practice {
    public static void main(String[] args) {
    }

    public static void num(int x) {
        if (x > 0) {
            return;
        }
        num(x + 1);
        x++;

    }
}
