class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class merge_sorting {

    public static Node FindMiddle(Node head){
Node slow=head;
Node fast=head.next;
//FIND middle Node
while (fast!=null &&  fast.next!=null) { 
    slow=slow.next; //+1
    fast=fast.next.next; //+2
}
return slow;
    }

public static Node merge(Node left,Node right){
   Node mergeLinkedList=new Node(-1);
   Node temp=mergeLinkedList;
while(right!=null && left!=null){
    if(left.data<=right.data){
        temp.next=left;
        left=left.next;
     }else{
        temp.next=right;
        right=right.next;
        
    }
    temp=temp.next;
}

while(right!=null){
 temp.next=right;
        right=right.next;
            temp=temp.next;
}
while(left!=null){
     temp.next=left;
        left=left.next;
          temp=temp.next;
}

    return mergeLinkedList.next;
}

public static  Node merge_sort(Node head){
    if(head==null || head.next==null){
        return head;
    }
    Node mid = FindMiddle(head);
Node rightHead=mid.next;
mid.next=null;

   Node newLeft= merge_sort(head);
   Node newRight=merge_sort(rightHead);
    return merge(newLeft,newRight);
}



    public static void main(String[] args) {
        Node obj1=new Node(1);
               Node obj2=new Node(2);
                       Node obj3=new Node(3);
                               Node obj4=new Node(4);
                               obj2.next=obj4;
                               obj1.next=obj3;
                               obj3.next=obj2;
                               
                               Node head=obj1; //obj1--obj3--obj2--obj4--null
                                      Node temp=head;
while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
}
   Node newHead= merge_sort(head);
  System.out.println();
temp=newHead;
while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
}
}
}
