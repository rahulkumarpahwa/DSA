package Recursion;

public class FriendsPairing {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int singleWays = friendsPairing(n - 1);
        int pairsWays = (n - 1) * friendsPairing(n - 2); 
        return singleWays + pairsWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3)); // expected output is 4
    }
}
