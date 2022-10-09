class TwoStacks
{
    int a[];
    int s1_size;
    int s2_size;
    int index1;
    int index2;
    TwoStacks(int ele1,int ele2,int size)
    {
        a = new int[size];
        index1 = 0;
        index2 = size-1;
        a[index1] = ele1;
        a[index2] = ele2;
        s1_size = 1;
        s2_size = 1;

    }

    void push1(int ele1)
    {
        a[index1+1] = ele1;
        s1_size++;
        index1++;
    }

    void push2(int ele2)
    {
        a[index2-1] = ele2;
        s2_size++;
        index2--;
    }

    int size1()
    {
        return s1_size;
    }

    int size2()
    {
        return s2_size;
    }

    int peek1()
    {
        return a[index1];
    }

    int peek2()
    {
        return a[index2];
    }

    int pop1()
    {
        int res = a[index1];
        a[index1] = -1;
        index1--;
        s1_size--;
        return res;
    }

    int pop2()
    {
        int res = a[index2];
        a[index2] = -1;
        index2++;
        s2_size--;
        return res;
    }

    boolean isEmpty1()
    {
        if(s1_size == 0)
            return true;
        return false;
    }

    boolean isEmpty2()
    {
        if(s2_size == 0)
            return true;
        return false;
    }

}
public class twostacks_in_array {
    public static void main(String[] args) {
        TwoStacks stack = new TwoStacks(10,10,20);

        stack.push1(20);
        stack.push2(30);
        stack.push1(40);
        stack.push2(50);

        System.out.println("Popped from s1: "+stack.pop1());
        System.out.println("Popped from s1: "+stack.pop1());
        System.out.println("Popped from s2: "+stack.pop2());

        System.out.println("Top element of s1: "+stack.peek1());
        System.out.println("Top element of s2: "+stack.peek2());

        System.out.println("Size of s1: "+stack.size1());
        System.out.println("Size of s2: "+stack.size2());

    }
}
