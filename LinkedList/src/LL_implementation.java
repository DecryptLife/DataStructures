class Node
{
    int data;
    Node next;
    Node(int element){
        data = element;
        next = null;
    }
}



public class LL_implementation {
    static void display(Node head)
    {
        Node node = head;
        while(node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);

        head.next = node1;
        node1.next = node2;

        display(head);
    }
}
