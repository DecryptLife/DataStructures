public class DLL_insert_first {

    static Node insertAtFirst(Node head)
    {
        Node temp =new Node(5);

        temp.next = head;
        if(head != null)
            head.prev = temp;


        return temp;
    }

    static void display(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;



        display(insertAtFirst(head));
    }
}
