import java.util.*;
public class solution_2_romanToInteger {
    public static int values(char ch){
        switch(ch)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public static int romanToInt(String s) {
        int total = 0;
      
        for(int i=0; i<s.length();i++)
        {
            
            if(i<=s.length() -2 && values(s.charAt(i)) < values(s.charAt(i+1)))
            {
                total += (values(s.charAt(i+1)) - values(s.charAt(i)));
                i++;
            }
            
            else
                total += values(s.charAt(i));
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
// Runtime: 7 ms, faster than 33.56% of Java online submissions for Roman to Integer.
// Memory Usage: 41.7 MB, less than 22.88% of Java online submissions for Roman to Integer.
