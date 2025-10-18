// https://takeuforward.org/plus/dsa/problems/closest-fair-integer

class Solution {
    public int closestFair(int n) {
        // my solution :
        int count = (int) (Math.log10(n) + 1);
        // if the number length is odd then it we will move to the number which is not
        // odd by taking 10 ^ digit count of the number. check with example.
        if (count % 2 != 0) {
            n = (int) Math.pow(10, count);
        }
        int N = 0;
        int ans = 0;
        while (true) {
            int even = 0, odd = 0;
            N = n;
            while (N > 0) {
                int ld = N % 10;
                if (ld % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                N /= 10;
            }
            if (even == odd) {
                ans = n;
                break;
            }
            n++;
        }
        return ans;
    }
}


class Solution {
  public int closestFair(int n) {
    // optimal solution :
    int count = (int) (Math.log10(n) + 1);
    // if the number length is odd then it we will move to the number which is not odd by taking 10 ^ digit count of the number. check with example.
    if (count % 2 != 0) {
      n = (int) Math.pow(10, count);
      count+=1;
    }
    int upperLimit = (int) Math.pow(10, count);
    int N = 0;
    int ans = 0;
    while (n<upperLimit) {
      int even = 0, odd = 0;
      N = n;
      while (N > 0) {
        int ld = N % 10;
        if (ld % 2 == 0) {
          even++;
        } else {
          odd++;
        }
        N /= 10;
      }
      if (even == odd) {
        ans = n;
        break;
      }
      n++;
    }
    return ans;
  }
}
