// Write a function that reverses a string. The input string is given as an array of characters s.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 

// Constraints:

// 1 <= s.length <= 105
// s[i] is a printable ascii character.
 

// Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.


public class solution_1_srev {
    public void reverseString(char[] s) {
        char temp;
        int len = s.length;
        len = (len%2 == 0)?len:len--;
        for(int i=0;i<len/2;i++)
        {
            temp = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = temp;
        }
        
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        solution_1_srev obj = new solution_1_srev();

        obj.reverseString(s);
    }
}













// Runtime: 110 ms, faster than 5.12% of Java online submissions for Reverse String.
// Memory Usage: 42.5 MB, less than 99.66% of Java online submissions for Reverse String.