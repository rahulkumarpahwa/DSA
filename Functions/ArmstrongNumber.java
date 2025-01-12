package Functions;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value you want to check:");
        int val = in.nextInt();

        boolean result = checkArmstrong(val);
        if (result) {
            System.out.println("The Given no. is Armstrong No.");
        } else {
            System.out.println("The Given no. is not Armstrong No.");
        }

        // additional part: To find the list of armstrong no.s between given range of
        // no.s:
        printArmstrongNumbers(100, 2000);
        in.close();
    }

    public static void printArmstrongNumbers(int low, int high) {
        for (int i = low; i <= high; i++) {
            boolean res = checkArmstrong(i);
            if (res) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkArmstrong(int val) {
        int nod = countDigits(val); // nod = no. of digits.
        int sum = 0;
        int n = val;
        while (n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem, nod);
            n = n / 10;
        }
        if (sum == val) {
            return true;
        } else {
            return false;
        }
    }

    public static int countDigits(int val) {
        int count = 0;
        while (val != 0) {
            val = val / 10;
            count++;
        }
        return count;
    }
}