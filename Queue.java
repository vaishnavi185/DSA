class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
         this.next=null;
    }
}


public class Queue {
    Node head;
    Node tail;
    int size;

    public void Enqueue(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next = newnode;
            tail=newnode;
        }
        size++;
    }

    public int Dequeue(){
        if(head==null){
            return 0;
        }
        else{
           int temp = head.data;
           head=head.next;
           size--;
           return temp;
        }
    }

    public int Peek(){
        if(head==null){
            return 0;
        }
        else{
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(89);
        q.Enqueue(78);

       
        q.Enqueue(80);

        System.out.println(q.Peek());
    }
}
