public class stack_ll {
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;

public static boolean isEmpty() {
    return head == null;
}

public static void push(int data){
Node newNode =new Node(data);
if(isEmpty()){
    newNode=head;
    return ;
}
newNode.next=head;
head=newNode;
}

public static int pop() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }

    int top = head.data;
    head = head.next;
    return top;
}

public static int peek() {
    if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
int top=head.data;
    return top;
}


public static void main(String[] args) {

   stack_ll.push(3);
  stack_ll.push(4);
while(!stack_ll.isEmpty()){

System.out.println(stack_ll.pop());
}
System.out.println(stack_ll.peek());
   

}
}
