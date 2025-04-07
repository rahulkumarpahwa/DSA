package ArraysQues;


public class answer {
    public static int linearSearch(String arr[], String value) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void PairsInArray(int arr[]) {
        int tp = 0; // total pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("the total pairs will be : " + tp);
    }

    public static void SubArrays(int arr[]) {
        int tp = 0; // total pairs
        for (int i = 0; i < arr.length; i++) {
            tp++;
            System.out.print("(" + arr[i] + ") ");
            for (int j = i + 1; j < arr.length; j++) {
                tp++;
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.print(") ");
            }
            System.out.println();
        }
        System.out.println("the total pairs will be : " + tp);
    }

    public static void SumSubArrays(int arr[]) {
        int tp = 0; // total pairs
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                tp++;
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];

                }
                System.out.print(") :: Sum =  " + sum + " || ");
                if (largest < sum) {
                    largest = sum;
                }
                if (smallest > sum) {
                    smallest = sum;
                }
                sum = 0;
            }
            System.out.print(" largest : " + largest + "  ||  smallest : " + smallest);
            smallest = Integer.MAX_VALUE;
            largest = Integer.MIN_VALUE;
            System.out.println();

        }
        System.out.println("the total pairs will be : " + tp);
    }

    public static void MaxSumSubArrayUsingPrefix(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Value : " + maxSum);

    }

    public static void Kadanes(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (ms < sum) {
                ms = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Max Value is : " + ms);
    }

    public static void main(String[] args) {

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int arr[] = new int[5];
        // System.out.println(arr);
        // for (int i = 0; i < 5; i++) {
        // System.out.println(arr[i]);
        // }

        // String arr[] = { "Apple", "Mango", "Guava", "Peaches" };
        // String value = new String("Guava");
        // System.out.println(arr);
        // int result = linearSearch(arr, value);
        // if (result == -1) {
        // System.out.println("can't found !");
        // } else {

        // System.out.println("the value is found at " + result);
        // }

        int arr2[] = { 2, 4, 6, 8, 10 };
        // PairsInArray(arr2);
        // SubArrays(arr2);
        SumSubArrays(arr2);
        MaxSumSubArrayUsingPrefix(arr2);
        int arr3[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; // max value = 7
        Kadanes(arr3);
    }
}
