// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.

import java.util.*;

public class solution_1_romanToInteger {
    public static int romanToInt(String s) {
        int total = 0;
        HashMap<Character,Integer> values = new HashMap<Character,Integer>();
        
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        if(s.length() <= 1)
            return values.get(s.charAt(0));
      
        for(int i=0; i<s.length();i++)
        {
            
            if(i<=s.length() -2 && values.get(s.charAt(i)) < values.get(s.charAt(i+1)))
            {
                total += (values.get(s.charAt(i+1)) -values.get(s.charAt(i)));
                i++;
            }
            
            else
            {
                
                total += values.get(s.charAt(i));
            }
            
        }
        return total;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman numerals");
        String s = sc.nextLine();
        int val = romanToInt(s);
        System.out.println("Integer value: "+val);
        sc.close();
    }   
}

//Runtime Statistics
// Runtime: 14 ms, faster than 12.51% of Java online submissions for Roman to Integer.
// Memory Usage: 43.6 MB, less than 9.31% of Java online submissions for Roman to Integer.