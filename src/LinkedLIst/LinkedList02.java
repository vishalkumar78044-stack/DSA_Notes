package LinkedLIst;
class Node{     //user define data type
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist {   // user defined data strecture
    Node head;  //null
    Node tail;  //null
    int size;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void display() {
        if(head == null) System.out.println("Empty");
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void deleteAtHead() {
        if(head == null) return;
        head = head.next;
        if(head == null) tail = null;
        size--;

    }



    void insert(int val, int idx) {
        if(idx<0 || idx >size) return;
        if(idx == 0) addAtHead(val);
        else if (idx == size) {
            addAtTail(val);
        }
        Node temp = new Node(val);
        Node t = head;
        for(int i; i <= idx; i++){
            Node t = t.next;
        }
        temp.next = t.next;
        t.next = temp;

    }
}

public class LinkedList02 {  //liskedlist data strecture
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
//        Node a = new Node(10);
//        Node b = new Node(20);
//        a.next = b;
        ll.addAtTail(10);
        ll.addAtHead(30);
        ll.addAtHead(70);
        ll.addAtHead(760);
        ll.addAtTail(60);
        ll.addAtTail(10);
        ll.display();
        ll.deleteAtHead();
        System.out.println(ll.size);
        ll.display();
        ll.insert(45,3);
        ll.display();

    }

}
