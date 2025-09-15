// https://takeuforward.org/plus/dsa/beginner-problem/basic-maths/count-all-digits-of-a-number

class Solution {
    public int countDigit(int n) {
        if(n == 0) return 1;
        while(n>0){
            int ld = n % 10;
            count++;
            n/=10;
        }
        return count;
    }
}

class Solution {
    public int countDigit(int n) {
        if(n == 0) return 1;
        return (int)(Math.log10(n) +1);
    }
}