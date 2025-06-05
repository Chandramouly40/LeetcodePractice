public class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    private Node head = null;
    private Node temp = null;

    public void insertAtEnd(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            temp = head;
        } else {
            temp.next = n;
            temp = n;
        }
    }
    public void insertAtBeg(int x){
        Node n = new Node(x);
        if(head == null){
            insertAtEnd(x);
        }
        else{
            n.next = head;
            head = n;
        }
    }
    public void deleteAtBeg(){
        if(head!=null){
            head = head.next;
        }
    }
    public void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void reverse() {
        Node first = head;
        Node second = head.next;
        head.next = null;
        while (second != null) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        head = first;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
