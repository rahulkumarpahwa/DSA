package Strings;
//  we need to find the largest string in the lexicographic order.

public class FindLargestString {

    public static String findLargest(String[] arr) {
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) { // The method returns 0 if the string is equal to the other string. A
                                                 // value less than 0 is returned if the string is less than the other
                                                 // string (less characters) and a value greater than 0 if the string is
                                                 // greater than the other string (more characters).
                largest = arr[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "orange", "mango" };
        String largest = findLargest(fruits);
        System.out.println(largest);

    }
}
