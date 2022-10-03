import java.util.Scanner;

public class LL_insert_first {
    static Node addFirst(Node head, int num)
    {
        Node new_node = new Node(num);

        new_node.next = head;

        return new_node;
    }

    static void addEnd(Node head, int num)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        Node new_node = new Node(num);

        temp.next = new_node;

    }
    static void addMiddle(Node start, int num, int middle)
    {
        Node middle_node = new Node(middle);
        while(start.data != num)
        {
            start = start.next;
        }
        middle_node.next = start.next;
        start.next = middle_node;

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

        Node head = new Node(20);
        Node node1 = new Node(40);
        Node node2 = new Node(50);

        head.next = node1;
        node1.next = node2;

        System.out.println("Enter the element to be added at the beginning");
        int num = sc.nextInt();
        System.out.println("Enter the element after which a node should be added");
        int pos = sc.nextInt();
        System.out.println("Enter the element to be added");
        int middle = sc.nextInt();
        System.out.println("Enter an element to be added at the end");
        int end = sc.nextInt();
        Node start = addFirst(head,num);
        addMiddle(start,pos,middle);
        addEnd(start,end);
        display(start);
    }
}
