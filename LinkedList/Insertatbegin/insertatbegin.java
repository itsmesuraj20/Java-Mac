package LinkedList.Insertatbegin;

class Node{
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

public class insertatbegin {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node temp = new Node(5);
        temp.next = head;
        head = temp;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
