package LinkedLIst;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class LinkedList01 {
    public static void main(String[] args) {
        //10 20 30 40 50
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        // connect karenge (link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(c.val);
//        System.out.println(c);
//        System.out.println(a.next.val);
//        System.out.println("e is : "+e.next);
        dis(a);
        System.out.println();
        disRec(a);

    }
    public static void disRec(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        disRec(head.next);
    }
    public static void dis(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
}
