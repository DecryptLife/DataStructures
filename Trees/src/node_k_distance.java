import java.util.Scanner;

public class node_k_distance {
    static void printNodes(Node root, int dist,int count)
    {
        if(root == null)
            return;
        if(count == dist)
        {
            System.out.println(root.key);
        }
        else
        {
            count+=1;
            printNodes(root.right,dist,count);
            printNodes(root.left,dist,count);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance at which nodes should be printed");
        int dist = sc.nextInt();
        int count = 0;
        Node root = new Node(10);
        root.right = new Node(30);
        root.left = new Node(8);
        root.right.right = new Node(50);
        root.right.left = new Node(40);
        root.right.right.left = new Node(70);

        printNodes(root,dist,count);
    }
}
