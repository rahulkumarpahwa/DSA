public class sample5 {
    public static int mySqrt(int x) {
        // my brute force
        if (x == 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 1; i <= x; i++) {
            if (i * i <= x) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
