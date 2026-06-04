public class reverse_double {
    public static void reverse_DoubleLL(){
DoubleLL.Node curr=DoubleLL.head;
DoubleLL.Node  prev=null;
DoubleLL.Node Next;
DoubleLL.tail=DoubleLL.head;
while(curr!=null){
    Next=curr.next;
    curr.next=prev;
    curr.prev=Next;    //<-----New step add;
    prev=curr;
    curr=Next;
}
DoubleLL.head=prev;
}
public static void main(String[] args) {
        DoubleLL ll=new DoubleLL();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        reverse_DoubleLL();
        System.out.println();
        ll.print();

    }
}
