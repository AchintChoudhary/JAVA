public class test{
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

   test.push(3);
   test.push(4);
while(!test.isEmpty()){

System.out.println(test.pop());
}
System.out.println(test.peek());
   

}
}