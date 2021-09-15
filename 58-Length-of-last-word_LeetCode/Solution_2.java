// using string methods

import java.util.Scanner;

public class Solution_2 {

    public static int lengthOfLastWord(String s)
    {
        s = s.trim();
        String last_word = s.substring(s.lastIndexOf(" ")+1, s.length());
        return last_word.length();
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


// Runtime Remarks
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
// Memory Usage: 37.3 MB, less than 66.93% of Java online submissions for Length of Last Word.