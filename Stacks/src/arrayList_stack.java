import java.lang.management.MemoryType;
import java.util.ArrayList;

class MyStack{

    ArrayList<Integer> al = new ArrayList<>();
    int size = 0;
    MyStack(int ele)
    {
        al.add(ele);
        size+=1;
    }

    void push(int ele)
    {
        al.add(ele);
        size+=1;
    }

    int pop()
    {
        if(size == 0) {
            System.out.println("No element to pop");
            return -1;
        }
        int res = al.get(size-1);
        al.remove(size-1);
        size -=1;
        return res;
    }

    int getSize()
    {
        return size;
    }

    boolean isEmpty()
    {
        return size == 0 ? true: false;
    }



}
public class arrayList_stack{
    public static void main(String[] args) {

        MyStack s = new MyStack(10);

        s.push(20);
        s.push(30);

        System.out.println("Size of stack: "+s.getSize());
        int a = s.pop();
        System.out.println(a+" popped out");
        int b = s.pop();
        System.out.println(b+" popped out");
        int c = s.pop();
        int d = s.pop();
        System.out.println(c+" popped out");
        System.out.println("Size of stack: "+s.getSize());
        System.out.println(s.isEmpty());

    }
}