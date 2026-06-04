class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class test{
  
  
  public static void  delete(int m, int n,Node head){
    Node curr=head;
Node t;
int count;
while(curr!=null){
    for(count=1;count<m && curr!=null;count++){
        curr=curr.next;
    }
    if(curr==null){
        return;
    }
    t=curr.next;
    for(count=1;count<=n && t!=null;count++ ){

        t=t.next;

    }
    curr.next=t;
    curr=t;
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
          
        Node head=obj2;
delete(2, 1, head);

Node temp=head;
while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
}
}
}