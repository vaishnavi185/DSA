

class Node {
    private int data;
    private Node next;

    public Node() {}

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

class LinkedList{
    private Node start;

    public void Findmid(){
        if (start == null) {  // Check if the list is empty
            System.out.println("The list is empty.");
            return;
        }
        Node slow = start;
        Node fast = start;
        while(fast!=null && fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }
        System.out.println("The middle element is: " + slow.getData());
    }

    public void insert(int val) {
        Node newNode = new Node(val, null);
        if (start == null) {
            start = newNode;  // First node becomes the start
        } else {
            Node temp = start;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);  // Add new node to the end of the list
        }
    }

    public void display(){
        Node temp=start;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
}






public class FindMid {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
l.Findmid();
    }
    
}
