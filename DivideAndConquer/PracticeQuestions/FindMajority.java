package PracticeQuestions;

public class FindMajority {

    public static int findMajority(int arr[]) {
        int map[] = new int[arr.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]]++;
        }

        for (int j = 0; j < map.length; j++) {
            if (map[j] > max) {
                max = map[j];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        System.out.println(findMajority(arr));
    }
}
