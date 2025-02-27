class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    Node head;
    int size;
    public void Push(int val){
       Node newnode = new Node(val);
       if(head==null){
        head = newnode;
       }else{
     newnode.next =head;
        head= newnode;
       }

       size++;

    }

    public int Pop(){
        if(head==null){
            return 0;
        }
        else{
            Node temp = head;
            head=head.next;
            temp=null;
        size--;
        return head.data;
    }
    }

    public int peek(){
        if(head==null){
            return 0;
        }
        else{
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(0);
        s.Push(9);
        s.Push(10);
        s.Pop();
        s.Pop();
        System.out.println(s.peek());
    }


}