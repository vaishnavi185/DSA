import java.util.*;

class Node {
    private int data;
    private Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Setters and Getters
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

class LinkList {
    private Node start;
    private int size;

    // Constructor
    public LinkList() {
        start = null;
        size = 0;
    }

    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (start == null) {
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

    // Print the list
    public void printList() {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    // Reverse the list
    public void reverse() {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }

        Node prev = null;
        Node current = start;
        Node next;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        start = prev;
    }
}

public class Reverse {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        // Adding elements to the list
        list.add(10);
        

        System.out.println("Original List:");
        list.printList();

        // Reverse the list
        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
