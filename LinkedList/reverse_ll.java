
public class reverse_ll {
  
    
public static void reverse_linkedList(){
LinkedList.Node curr=LinkedList.head;
LinkedList.Node  prev=null;
LinkedList.Node Next;
LinkedList.tail=LinkedList.head;
while(curr!=null){
    Next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=Next;
}
LinkedList.head=prev;
}



    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.AddFirst(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.print();
        reverse_linkedList();
        ll.print();

    }
}
