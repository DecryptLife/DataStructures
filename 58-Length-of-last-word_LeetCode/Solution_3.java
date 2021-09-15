import java.util.*;
public class Solution_3 {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        int end = s.length()-1;
        
        while( end >=0 && s.charAt(end) == ' ')
            end--;
        
        while( end >=0  && s.charAt(end) != ' ')
        {
            len++;
            end--;
        }
        
        return len;
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
// Memory Usage: 37.2 MB, less than 76.48% of Java online submissions for Length of Last Word.
