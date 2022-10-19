public class pairwise_swap_recursion {
    static Node swap(Node head)
    {
        Node temp = head;
        while(temp != null && temp.next != null)
        {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;

            temp = temp.next.next;
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
        Node head = new Node(1);

        head.next =new Node(2);
        head.next.next =new Node(3);
        head.next.next.next =new Node(4);
        head.next.next.next.next =new Node(5);



        display(swap(head));

    }
}
