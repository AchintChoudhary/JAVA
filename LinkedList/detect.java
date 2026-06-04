class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class detect {


public static boolean check_cycle(Node head){
Node slow =head;
Node fast =head;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
        return true;
    }
}
    return false;
}

    
    
    public static void main(String[] args) {
         Node obj1=new Node(20);    //(data:20 | next:null)
        Node obj2=new Node(30); //(data:30 | next:null)
Node obj3=new Node(40);

        obj2.next=obj1;//(data:30 | next:obj1)
        obj1.next=obj3; //(data:30 | next:obj3)
        obj3.next=obj2; //(data:30 | next:obj2)
        Node head=obj2;
        System.out.println("Cycle detected : "+check_cycle(head));
    }
}
