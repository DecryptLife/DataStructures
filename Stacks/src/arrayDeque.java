import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element is "+s.peek());
        System.out.println("Element popped from stack: "+s.pop());
        System.out.println("Top element is "+s.peek());
        System.out.println("Size of stack: "+s.size());
        System.out.println("Stack empty: "+s.isEmpty());


    }
}
