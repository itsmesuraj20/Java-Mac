package Tree.BinaryTreeImplementation;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int x){
        data = x;
        left = null;
        right = null;
    }
};

public class Binarytreeimplementation {
    public static void main (String args [])
    {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.right.right = new Node(5);
        
    }
}
