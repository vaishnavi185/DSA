class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyDequeue {
    Node head;
    Node tail;
    int size;

    MyDequeue(){
        head = tail = null;
        size = 0;
    }

    boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    void addFirst(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    void addLast(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    int peekFirst(){
        if(isEmpty()){
            return -1;
        }else{
            return head.data;
        }
    }

    int peekLast(){
        if(isEmpty()){
            return -1;
        }else{
            return tail.data;
        }
    }

    int removeFirst(){
        if(isEmpty()){
            return -1;
        }else{
            int result = head.data;
            head = head.next;
            size--;
            if(size==0){
                head = tail = null;
            }
            return result;
        }
    }
    
  
    int removeLast() {
        if (isEmpty()) {
            return -1;
        }

        int result = tail.data;

        if (size == 1) { 
            head = tail = null;
        } else {
            Node curr = head;
            for (int i = 0; i < size - 2; i++) { 
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }

        size--;
        return result;
    }


    public static void main(String[] args) {
        MyDequeue myDeque = new MyDequeue();
        myDeque.addFirst(20);
        myDeque.addFirst(30);
        myDeque.addLast(40);
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque.removeFirst());
        System.out.println(myDeque.removeLast());
        myDeque.addLast(70);
        myDeque.addFirst(40);
        System.out.println(myDeque.removeLast());
        System.out.println(myDeque.peekFirst());
        System.out.println(myDeque.peekLast());
        System.out.println(myDeque.isEmpty());
    }

}