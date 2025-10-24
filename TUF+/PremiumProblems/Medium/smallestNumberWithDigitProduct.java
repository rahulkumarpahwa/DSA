// https://takeuforward.org/plus/dsa/problems/smallest-number-with-given-digit-product

// brute 
class Solution {
    public String smallestNumber(long n) {
        // my Solution:
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        List<Integer> ans = new ArrayList<>();
        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                ans.add(i);
                n /= i;
            }
        }
        if (n > 1)
            return "-1";
        Collections.sort(ans);
        String str = "";
        for (int num : ans) {
            str += num;
        }
        return str;
    }
}


// https://chatgpt.com/share/68fbb8df-9870-8002-9418-b8d867ade10a
// read this article important.