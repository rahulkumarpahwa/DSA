// https://takeuforward.org/plus/dsa/binary-search/on-answers/find-square-root-of-a-number

class Solution {
    public int floorSqrt(int n) {
        // Linear :
        int ans = -1;
        for (int i = 0; i <= n; i++) {
            if ((long) i * (long) i <= (long) n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }
}

class Solution {
    public int floorSqrt(int n) {
        // binary search:
        int i = 0, j = n;
        int ans = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if ((long) mid * (long) mid <= (long) n) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }
}

// here the core logic is to use the 'long' datatype to prevent the overflow and
// 'break;' for the linear one.