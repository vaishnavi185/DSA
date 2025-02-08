import java.util.Arrays;

public class ThreeStack {
  private int top;
  private int[] stack;
  private int size;

 public ThreeStack(int size){
  this.size = size;
  stack = new int[size];
  top=-1;
 }
 
 public void push(int value){
  if(top>=size-1){
System.out.print("stack overflow");
  }
  else{
    top++;
    stack[top]=value;
 
  }
 }

 public void pop(){
  if(top==-1){
    System.out.print("stack underflow");
  }
  else{
    top--;

  }
 }
 public void peek(){
  System.out.print(stack[top]);
 }
 public void display(){
  for(int i=0;i<=top;i++){
    System.out.print(stack[i]);
  }
  System.out.println();
 }
  public static void main(String[] args) {
    ThreeStack stack = new ThreeStack(6);
    stack.push(3);
    stack.push(7);
    stack.push(9);
    stack.pop();
    stack.display();

  }

}
