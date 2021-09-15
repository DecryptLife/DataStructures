// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

//Program
import java.util.*;
public class solution_1_using_stacks {
    public static boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        for(char ch: s.toCharArray())
        {
            if(stack.empty())
                stack.push(ch);
            else
            {
                if(ch == '{' || ch == '[' || ch == '(')
                    stack.push(ch);
                else
                {
                    char top = (Character) stack.peek();
                    if(ch == '}' && top == '{' ||
                       ch == ')' && top == '(' ||
                       ch == ']' && top == '[')
                        stack.pop();
                    else
                        stack.push(ch);
                }
            }
        }
            
        if(stack.empty())
            return true;
        else
            return false;
        
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = sc.nextLine();
        boolean val = isValid(s);
        if(val)
            System.out.println("Well ordered parentheses");
        else
            System.out.println("Not in order");
        sc.close();
    }
}


// Runtime message
// Runtime: 1 ms, faster than 98.96% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.1 MB, less than 68.92% of Java online submissions for Valid Parentheses.