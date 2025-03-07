package ArraysQues;

public class RainWaterTrapped {

    // Optimised.
    public static int rainWaterTrapped2(int arr[]) {
        int trappedWater = 0;

        int leftMax[] = new int[arr.length];

        leftMax[0] = arr[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = rightMax.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            if (waterLevel > arr[i]) {
                trappedWater += (waterLevel - arr[i]);
            }
        }

        return trappedWater;
    }

    // Time Limit exceeded : (Not optimised.)
    public static int MaxLeft(int i, int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j <= i; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

    // Time Limit exceeded : (Not optimised.)
    public static int MaxRight(int i, int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }

    // Time Limit exceeded : (Not optimised.)
    public static int rainWaterTrapped(int arr[]) {
        int trappedWater = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int waterLevel = Math.min(MaxLeft(i, arr), MaxRight(i, arr));
            if (waterLevel > arr[i]) {
                trappedWater += (waterLevel - arr[i]);
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(rainWaterTrapped(heights));
        System.out.println(rainWaterTrapped2(heights));
    }
}
