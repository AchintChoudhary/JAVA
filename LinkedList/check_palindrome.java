
public class check_palindrome {
    public static LinkedList.Node FindMiddle(LinkedList.Node head){
LinkedList.Node slow=LinkedList.head;
LinkedList.Node fast=LinkedList.head;
//FIND middle Node
while (fast!=null &&  fast.next!=null) { 
    slow=slow.next; //+1
    fast=fast.next.next; //+2
}

return slow;
    }
    
    public static boolean checkPalindrome(){
        if(LinkedList.head ==null || LinkedList.head.next ==null){
            return false;
        }
        //REVERSE  2nd half
        LinkedList.Node middleNode=FindMiddle(LinkedList.head);
LinkedList.Node prev=null;
LinkedList.Node curr =middleNode;
LinkedList.Node Next;
 
while(curr!=null){
    Next=curr.next;
    curr.next=prev;
prev=curr;
curr=Next;
}

//check palindrome (1st half==2nd half)
 LinkedList.Node right=prev; //right part HEAD;
LinkedList.Node left=LinkedList.head;  //left part HEAD;

while(right!=null){
if(left.data != right.data){
return false;
}
right=right.next;
left=left.next;
}
return true;
}
    
    
    public static void main(String[] args) {
    LinkedList ll=new LinkedList();
        ll.AddFirst(1);
        ll.AddFirst(0);
        ll.AddFirst(1);
        ll.AddFirst(0);
        ll.AddFirst(9);
   
        
       boolean result= checkPalindrome();
    System.out.println("LinkedList is palindrome : "+result);
    }
}
