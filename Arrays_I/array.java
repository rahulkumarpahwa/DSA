package Arrays_I;

public class array {
    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);
        // [I@722c41f4
        // the '[' represents the address of the array, I represents that it is Integer
        // type and after @ it is the address of the array's first element.

        System.out.println(arr.length);

        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 60;
        arr[4] = 80;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // enhanced for loop.
        for (int val : arr) {
            System.out.println(val);
        }

        // case 1:
        System.out.println("----case 1-----");

        int[] arr2 = arr;
        arr2[3] = 100;
        System.out.println(arr[3]);

        // case 2:
        System.out.println("----case 2-----");

        int i = 0;
        int j = 2;
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + ", " + arr[j]);

        // case 3:
        System.out.println("----case 3-----");

        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + ", " + arr[j]);

    }

    public static void swap(int one, int two) {
        // pass by value
        int temp = one;
        one = two;
        two = temp;
    }

    public static void swap(int[] a, int i, int j) {
        // pass by reference.
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
