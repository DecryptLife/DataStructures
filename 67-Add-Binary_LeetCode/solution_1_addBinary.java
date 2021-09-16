// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"

import java.util.Scanner;

public class solution_1_addBinary {
    public static String addZeros(String small, int len)
    {
        for(int i = small.length(); i<len; i++)
        {
                    small = "0"+small;
        }
        return small;
    }
    public static String addEqual(String a,String b)
    {
        String sum = "";
        char carry = '0';
        for(int i=a.length()-1;i>= 0; i--)
        {
            if(a.charAt(i) == '0' && b.charAt(i) == '0')
            {
                if(carry != '1')
                {
                    sum = "0" + sum;
                }
                else
                {
                    sum = "1" + sum;
                }
                carry = '0';
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '0'||
                   a.charAt(i) == '0' && b.charAt(i) == '1')
            {
                if(carry != '1')
                {
                    sum = "1" + sum;
                    carry = '0';
                }
                else
                {
                    sum ="0" + sum;
                    carry = '1';
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '1')
            {
                if(carry != '1')
                {
                    sum = "0" + sum;
                    carry = '1';                 
                }
                else
                {
                    sum = "1" + sum;
                    carry = '1';
                }
            }
        }
        if(carry == '1')
        {
            sum = carry + sum;
        }
            
        return sum;
        
    }
    public static String addBinary(String a, String b) {
        
        if(a.length() != b.length())
        {
            if(a.length() < b.length())
                a = addZeros(a,b.length());
            else
                b = addZeros(b,a.length());
        }
        
        String bin_sum = addEqual(a,b);
        
       return bin_sum;
            
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary value");
        String a = sc.nextLine();
        System.out.println("Enter first binary value");
        String b = sc.nextLine();
        String answer = addBinary(a, b);

        System.out.println("Answer: "+answer);
        sc.close();
    }
}

// Runtime stats
// Runtime: 11 ms, faster than 7.26% of Java online submissions for Add Binary.
// Memory Usage: 41.1 MB, less than 5.24% of Java online submissions for Add Binary.