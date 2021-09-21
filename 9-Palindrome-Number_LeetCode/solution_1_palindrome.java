// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

 

// Example 1:

// Input: x = 121
// Output: true
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public class solution_1_palindrome {
    public static boolean isPalindrome(int x) {
        int sum =0; int rem = 0;
        int num = x;
        if(x <0)
            return false;
        else
        {
            while(x>0)
            {
                rem = x%10;
                sum = sum *10 +rem;
                x=x/10;
            }
            if(sum == num)
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.print(isPalindrome(10));
    }
}


// Runtime stats
// Runtime: 15 ms, faster than 22.85% of Java online submissions for Palindrome Number.
// Memory Usage: 41.4 MB, less than 16.56% of Java online submissions for Palindrome Number.