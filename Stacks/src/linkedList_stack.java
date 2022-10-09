class Node
{
    Node next;
    int data;
    Node(int ele)
    {
        data = ele;
    }

}
class NStack
{
    Node root;
    int size = 0;
    NStack(int ele)
    {
        root = new Node(ele);
        size = 1;
    }

    void push(int ele)
    {
        Node temp = null;
        temp = new Node(ele);
        temp.next = root;
        root = temp;
        size +=1;
    }

    int pop()
    {
        if(size == 0)
            return Integer.MAX_VALUE;
        int res = root.data;
        Node temp = root;
        root = temp.next;
        size -=1;
        return res;
    }

    int getSize()
    {
        return size;
    }

    int peek()
    {
        if(size == 0)
        {
            return Integer.MAX_VALUE;
        }
        return root.data;
    }
    boolean isEmpty()
    {
        return size == 0? true: false;
    }
}
public class linkedList_stack {

    public static void main(String[] args) {
        NStack ns = new NStack(10);
        ns.push(3);
        ns.push(5);
        System.out.println(ns.peek());
        System.out.println(ns.pop());
        System.out.println(ns.peek());
        System.out.println(ns.pop());
        System.out.println(ns.isEmpty());
        System.out.println(ns.pop());
        System.out.println(ns.isEmpty());
        int last = ns.pop();
        System.out.println(last == Integer.MAX_VALUE ? "No element present in stack": last);
    }
}
