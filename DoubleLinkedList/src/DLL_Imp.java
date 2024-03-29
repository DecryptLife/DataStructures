class Node
{
    int data;
    Node prev;
    Node next;
    Node (int ele){
        data = ele;
        prev = null;
        next = null;
    }
}
public class DLL_Imp {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        System.out.println("Moving forward");
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        System.out.println("Moving backward");
        while(temp2 !=null)
        {

            System.out.print(temp2.data + " ");
            temp2 = temp2.prev;
        }
    }
}
