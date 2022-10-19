import java.util.HashMap;

public class removing_duplicates_unsorted {
    static public Node removeDuplicates(Node head)
    {
        // Your code here
        Node temp = head;

        if(head == null)
            return null;
        Node next = null;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(temp.data,1);
        Node prev = temp;
        temp = temp.next;
        while(temp != null)
        {
            if(map.containsKey(temp.data))
            {
                prev.next = temp.next;
                temp = temp.next;
            }
            else
            {
                map.put(temp.data,1);
                temp = temp.next;
                prev = prev.next;
            }
        }
        return head;
    }

    static void display(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);

        System.out.println("Before removing");
        display(head);
        System.out.println();
        Node top = removeDuplicates(head);
        System.out.println("After removing");
        display(top);
    }
}
