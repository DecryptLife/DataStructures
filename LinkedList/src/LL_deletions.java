import java.util.Scanner;

public class LL_deletions {
    static Node deleteFirst(Node head)
    {
        head = head.next;
        return head;
    }
    static void deleteEnd(Node head)
    {

        while(head.next.next != null)
        {
            head = head.next;
        }
        head.next = null;
    }

    static void deleteMiddle(Node start, int ele)
    {
        Node new_node = new Node(ele);

        while(start.data != ele)
        {
            start = start.next;
        }
        start.next = start.next.next;

    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println("Enter the number after which the node should be deleted");
        int num = sc.nextInt();

        head = deleteFirst(head);
        deleteMiddle(head,num);
        deleteEnd(head);
        display(head);
    }
}
