import java.util.ArrayDeque;
import java.util.Stack;

public class BalancedParenthesis {

    static void stackOp(ArrayDeque<Character> stack, char val)
    {
        if(stack.isEmpty())
            stack.push(val);
        else
            if(val == stack.peek())
                stack.pop();
            else
                stack.push(val);
    }
    public static void main(String[] args) {
        String s = "{}[([])]";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<s.length();i++)
        {
            char val = s.charAt(i);
            if(val != '{' && val != '[' && val!='(')
                switch (val)
                {
                    case '}':
                        val =  '{';
                        stackOp(stack,val);
                        break;
                    case ']':
                        val = '[';
                        stackOp(stack,val);
                        break;
                    case ')':
                        val = '(';
                        stackOp(stack,val);
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpecred argument: "+val);
                }
            else
                stack.push(val);


        }
        if(stack.isEmpty())
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Parenthesis not balanced");


    }
}
