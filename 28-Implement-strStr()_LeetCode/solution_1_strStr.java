// Implement strStr().

// Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Clarification:

// What should we return when needle is an empty string? This is a great question to ask during an interview.

// For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

// Example 1:

// Input: haystack = "hello", needle = "ll"
// Output: 2
// Example 2:

// Input: haystack = "aaaaa", needle = "bba"
// Output: -1
// Example 3:

// Input: haystack = "", needle = ""
// Output: 0
 

// Constraints:

// 0 <= haystack.length, needle.length <= 5 * 104
// haystack and needle consist of only lower-case English characters.


// *********** PROGRAM *************
public class solution_1_strStr{
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        
        return -1;
    }
    public static void main(String[] args)
    {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));
        System.out.println(strStr("",""));

    }
}

// Runtime stats
// Runtime: 302 ms, faster than 82.28% of Java online submissions for Implement strStr().
// Memory Usage: 39.8 MB, less than 27.02% of Java online submissions for Implement strStr().