public class DoubleLL{
static class Node{
    Node prev;
    Node next;
    int data;

    Node(int data){
this.data=data;
prev=null;
next=prev;
    }
}

public static Node head;
public  static Node tail;
public static int size;

//addFirst
public void addFirst(int data){
Node newNode=new Node(data);
size++;
if(head==null ){
   head = tail = newNode;
            return;
}
newNode.next=head;
head.prev=newNode;

head=newNode;

}

//add last
public void addLast(int data){
    Node newNode=new Node(data);
    size++;
  
    if(head == null){
        head = tail = newNode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
    newNode.prev=temp;
    newNode.next=null;
    tail=newNode;
}


//delete First
public void deleteFirst(){
    if(head==null){
        System.out.println("LinkedList is Empty");
        return;
    }
    //special case
    if(size==1){
  int data=head.data;
  System.out.println("deleted data : "+data);
  head=tail=null;
  size--;
  return ;
    }
   int data=head.data;
    head=head.next;
System.out.println("deleted data : "+data);
    head.prev=null;
    size--;
}

//delete last;
public  void deleteLast(){
    Node temp=head;
if(head==null){
    System.out.println("Linked List empty");
   return ;
}
if(size==1){
    int data=head.data;
    System.out.println("deleted data : "+data);
    head=tail=null;
    size--;
    return;
}

    for(int i=0;i<size-2;i++){
temp=temp.next;
    }

int data = temp.next.data;
System.out.println("deleted data : "+data);
        tail = temp;
        temp.next = null;
        size--;

}

//add in the middle
public  void addInMiddle(int index,int data){
    
        if(index == 0){
        addFirst(data);
        return;
    }

    Node newNode=new Node(data);
    Node p=head;
    for(int i=0;i<index-1;i++){
        p=p.next;
        if(p == null){
            System.out.println("Invalid index");
            return;
        }
    }
newNode.next=p.next;
newNode.prev = p;
 // If not inserting at end
    if(p.next != null){
        p.next.prev = newNode;
    }

p.next = newNode;


}

//delete in middle
public static void deleInMiddle(int idx){

}

//print
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}

    public static void main(String[] args) {
    
}
}