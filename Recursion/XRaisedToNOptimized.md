public static int xPowerN2(int base, int power) { // complexity is O(log(n))

        // base condition
        if (power == 0) { // as we keep on dividing the power in half then it become zero in end.
            return 1;
        }

        int recursive = xPowerN2(base, power / 2);
        int halfSquare = recursive * recursive;

        if (power % 2 != 0) { // odd power
            halfSquare *= base;
        }
        return halfSquare;

}

# Program Explanation

This program calculates the power of a number (base) raised to another number (power) using a technique that has a time complexity of O(log(n)). The method used here is called Exponentiation by Squaring.

Base Condition: The function checks if the power is 0. If it is, the function returns 1, because any number raised to the power of 0 is 1.

Recursive Call: The function calls itself recursively with the base and half of the power (power / 2).

Half Square: The result of the recursive call is squared to get the intermediate result (halfSquare).

Odd Power Adjustment: If the original power was odd, the function multiplies the halfSquare by the base to adjust for the odd exponent.

Return: The final result is returned.

# Call Stack Explanation

Let's take an example with base = 2 and power = 5 to see how the call stack works:

First Call (2, 5):

Since power is not 0, it makes a recursive call with xPowerN2(2, 2).

Second Call (2, 2):

Again, power is not 0, so it makes a recursive call with xPowerN2(2, 1).

Third Call (2, 1):

Power is not 0, so it makes a recursive call with xPowerN2(2, 0).

Fourth Call (2, 0):

Power is 0, so it returns 1.

Now let's unwind the stack:

Return to Third Call (2, 1):

recursive = 1

halfSquare = 1 \* 1 = 1

Since power (1) is odd, halfSquare _= 2 → halfSquare = 1 _ 2 = 2

Returns 2.

Return to Second Call (2, 2):

recursive = 2

halfSquare = 2 \* 2 = 4

Since power (2) is even, halfSquare remains 4.

Returns 4.

Return to First Call (2, 5):

recursive = 4

halfSquare = 4 \* 4 = 16

Since power (5) is odd, halfSquare _= 2 → halfSquare = 16 _ 2 = 32

Returns 32.

# Call Stack Visualization

Here's a visual representation of how the call stack gets cleared:

xPowerN2(2, 5) calls xPowerN2(2, 2)

xPowerN2(2, 2) calls xPowerN2(2, 1)

xPowerN2(2, 1) calls xPowerN2(2, 0)

xPowerN2(2, 0) returns 1 (base case)

Now unwinding the stack:

xPowerN2(2, 1) returns 2 (after adjusting for odd power)

xPowerN2(2, 2) returns 4 (after squaring)

xPowerN2(2, 5) returns 32 (after adjusting for odd power)

Thus, the final output for xPowerN2(2, 5) is 32.

# show more steps of unwind in visualization

Of course! Let's break it down even further with more steps during the unwinding process. We'll continue with the example of base = 2 and power = 5.

Initial Calls:

xPowerN2(2, 5) -> xPowerN2(2, 2) -> xPowerN2(2, 1) -> xPowerN2(2, 0)
Base Case:

xPowerN2(2, 0) returns 1
Unwinding Steps:

xPowerN2(2, 1)

- Recursive result: 1
- Half square: 1 \* 1 = 1
- Odd power adjustment: 1 \* 2 = 2
- Returns: 2

xPowerN2(2, 2)

- Recursive result: 2
- Half square: 2 \* 2 = 4
- Even power: No adjustment needed
- Returns: 4

xPowerN2(2, 5)

- Recursive result: 4
- Half square: 4 \* 4 = 16
- Odd power adjustment: 16 \* 2 = 32
- Returns: 32
  Call Stack Visualization with Detailed Steps
  Initial Call Stack:

xPowerN2(2, 5) - Pending
xPowerN2(2, 2) - Pending
xPowerN2(2, 1) - Pending
xPowerN2(2, 0) - Returns 1
Unwinding Step 1 (xPowerN2(2, 1)):

xPowerN2(2, 5) - Pending
xPowerN2(2, 2) - Pending
xPowerN2(2, 1) - Processing...

- Recursive: 1
- Half square: 1 \* 1 = 1
- Odd power adjustment: 1 \* 2 = 2
- Returns: 2
  Unwinding Step 2 (xPowerN2(2, 2)):

xPowerN2(2, 5) - Pending
xPowerN2(2, 2) - Processing...

- Recursive: 2
- Half square: 2 \* 2 = 4
- Even power: No adjustment needed
- Returns: 4
  Unwinding Step 3 (xPowerN2(2, 5)):

xPowerN2(2, 5) - Processing...

- Recursive: 4
- Half square: 4 \* 4 = 16
- Odd power adjustment: 16 \* 2 = 32
- Returns: 32
