import java.util.*;

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

public class LinkedList {
    private int size;
    private Node start;

    public LinkedList() {
        size = 0;
        start = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void viewList() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public void insertAtFirst(int val) {
        Node newNode = new Node(val, start);
        start = newNode;
        size++;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val, null);
        if (isEmpty()) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void insertAtPos(int val, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == size + 1) {
            insertAtEnd(val);
        } else {
            Node newNode = new Node(val, null);
            Node temp = start;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            size++;
        }
    }

    public void printLinkList() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(10);
        list.insertAtEnd(20);
        list.insertAtPos(15, 2);
        // Expected output: 10 15 20
    
        list.viewList();
    }
}
