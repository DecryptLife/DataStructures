class Node
{
    int key;
    Node left;
    Node right;
    Node(int ele)
    {
        key = ele;
    }
}
public class Tree_traverse {

    static void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }

    static void preorder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        System.out.println("Postorder");
        postorder(root);
        System.out.println("\nPreorder");
        preorder(root);
        System.out.println("\nInorder");
        inorder(root);
    }
}
