class Node
{
    Node root;
    int data;
    Node right;
    Node left;
    Node(int ele)
    {
        data = ele;
    }
}
public class bst_impl {

//    static void displayBST(Node node)
//    {
//        while(node != null)
//        {
//            System.out.println(node.data);
//            if(node.left != null)
//                System.out.println(node.left.data);
//            if(node.right != null)
//                System.out.println(node.right.data);
//            node = node.
//        }
//    }
    public static void main(String[] args) {

        int[] a = {20,15,30,40,50,12,18,35,80,7};

        Node root = new Node(a[0]);
        Node temp = root;
        for(int i=1;i<a.length;i++)
        {
            insertToTree(temp,a[i]);
        }

        display(temp);




    }

    private static void insertToTree(Node temp, int ele) {
        Node prev = null;
        while(temp != null)
        {
            prev = temp;
            if(ele > temp.data)
            {
                temp = temp.right;
            }
            else if(ele < temp.data)
            {
                temp = temp.left;
            }
        }

        if(ele > prev.data)
        {
            prev.right  = new Node(ele);
        }
        else
        {
            prev.left = new Node(ele);
        }
    }

    private static void display(Node temp)
    {
        if(temp == null)
            return;
        System.out.println(temp.data);
        display(temp.left);
        display(temp.right);
    }
}
