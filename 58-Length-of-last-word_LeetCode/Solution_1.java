import java.util.Scanner;

// Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

// A word is a maximal substring consisting of non-space characters only.

// Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.
 

// Constraints:

// 1 <= s.length <= 104
// s consists of only English letters and spaces ' '.
// There will be at least one word in s.
public class Solution_1
{
    public static int lengthOfLastWord(String s) {
        char ch = ' ';
        s = s.trim();
        String new_s="";
        for(int i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch != ' ')
            {
                new_s = new_s+ch;
            }
            else
            {
                new_s ="";
            }
        }
        
        return new_s.length();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int len = lengthOfLastWord(s);
        System.out.println(len);
        sc.close();
    }
}

// Remarks
// Runtime: 12 ms, faster than 5.18% of Java online submissions for Length of Last Word.
// Memory Usage: 39.3 MB, less than 6.56% of Java online submissions for Length of Last Word.