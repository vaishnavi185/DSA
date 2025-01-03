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


public class linkkii {
    private Node start;

    public linkkii() {
        start = null;
    }

    public void HeadInsert(int data) {
        Node newNode = new Node(data, start);  // Directly assigning start to the next node
        start = newNode;  // Updating the start pointer
    }

    public void printList() {
        Node curr = start;
        while (curr != null) {
            System.out.print(curr.getData() + " -> ");
            curr = curr.getNext();
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkkii list = new linkkii();
        list.HeadInsert(7);
        list.printList();
    }
}
