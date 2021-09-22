// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
// Example 4:

// Input: x = 0
// Output: 0
 

// Constraints:

// -2^31 <= x <= 2^31 - 1

public class solution_1_reverseInt {
    public static boolean is32bitSignedInteger(long x)
    {
        
        return (x <= (Math.pow(2,31) -1) && (x >= -Math.pow(2,31)));
    }
    public static int reverse(int x) {
        
            long rem = 0;
            long sum = 0;
            while(x!=0)
            {
                rem = x%10;
                sum = sum*10+rem;
                x = x/10;
                
            }
            return is32bitSignedInteger(sum)?(int)sum:0;
        
        
    }
    public static void main(String[] args)
    {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        
    }
}


// Runtime stats
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
// Memory Usage: 36.2 MB, less than 65.46% of Java online submissions for Reverse Integer.