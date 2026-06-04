public class delete_nth_from_end {
    
    
public static void  delete_in_middle(int n,int size){
LinkedList.Node prev=LinkedList.head;
if(n==size){
    LinkedList.head=LinkedList.head.next;
    return;
}
    for(int i=1;i<size-n;i++){
prev=prev.next;
}
int data=prev.next.data;
 

prev.next=prev.next.next;

System.out.println("removed : "+data);
}


    public static void main(String[] args) {
     LinkedList ll=new LinkedList();
   ll.AddFirst(4);
     ll.AddFirst(3);
     ll.AddFirst(2);
     ll.AddFirst(1);   
 ll.print();
 int size=LinkedList.size;
 
delete_in_middle(3,size);
ll.print();
     }
}
