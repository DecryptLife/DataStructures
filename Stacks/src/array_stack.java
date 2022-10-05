class Stack{
    int arr[];
    int cap;
    int top;
    Stack(int c)
    {
        cap =c;
        top = -1;
        arr = new int[cap];
    }
    void push(int num)
    {
        top++;
        arr[top] = num;
    }

    int pop()
    {
        int res = arr[top];
        top--;
        return res;
    }

    int peek()
    {
        int res = arr[top];
        return res;
    }

    int size()
    {
        return top+1;
    }

    boolean isEmpty()
    {
        if(top == -1)
            return true;

        return false;
    }

}
public class array_stack {
    public static void main(String[] args) {
        Stack s = new Stack(10);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        System.out.println(s.size());
        s.pop();
        System.out.println(s.size());
        s.push(5);
        System.out.println(s.size());
        System.out.println(s.peek());
    }
}
