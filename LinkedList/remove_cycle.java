class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class remove_cycle {
    public static void  removeCycle(Node head){
Node slow =head;
Node fast =head;
Node prev=null;
boolean flag=false;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow){
    flag=true;
    break;
    }
}
//Find meeting point
if(flag){
    slow=head;
    while(slow!=fast){
        prev=fast;
        slow=slow.next;
       
        fast=fast.next;

    }
    //Last node is to be null;
    prev.next=null;
    System.out.println("cycle removed");
}else{
System.out.println("Their is No cycle");
}

}



        public static void main(String[] args) {
         Node obj1=new Node(20);    //(data:20 | next:null)
        Node obj2=new Node(30); //(data:30 | next:null)
Node obj3=new Node(40);
Node obj4=new Node(50);
        obj2.next=obj1;//(data:30 | next:obj1)
        obj1.next=obj3; //(data:30 | next:obj3)
        obj3.next=obj4; //(data:30 | next:obj2)
           obj4.next=obj1;
        Node head=obj2;
        removeCycle(head);
    }
}
