import java.util.ArrayList;

class MyStack{

//    Normal arrays cannot do dynamic resizing, so we use ArrayList
    ArrayList<Integer> al = new ArrayList<>();

    void push(int num)
    {
        al.add(num);
    }

    int peek()
    {
        return al.get(al.size()-1);
    }

    int pop()
    {
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    int size()
    {
        return al.size();
    }

    boolean isEmpty()
    {
        return (al.size() == 0);
    }

}
public class arrayList_stack {
    public static void main(String[] args) {
        MyStack s = new MyStack();

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
