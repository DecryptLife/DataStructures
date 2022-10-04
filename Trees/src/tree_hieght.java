public class tree_hieght {
    static int hieght(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
            return Math.max(hieght(root.left),hieght(root.right))+1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(30);
        root.left = new Node(8);
        root.right.right = new Node(50);
        root.right.left = new Node(40);

        System.out.println("Hieght of tree: "+hieght(root));

    }
}
