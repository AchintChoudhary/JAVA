public class circular {    

public static class Node{
  int data;
    Node next;
    Node(int data){
        this.data=data;
 this.next=null;
    }
}

static Node head;
static Node tail;
static int size;

public static void addFirst(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=tail=newNode;
        tail.next=head;
        size++;
      return;
    }

    newNode.next=head;
        size++;
    head=newNode;
    tail.next=head;
}

public static void addLast(int data){
        Node newNode=new Node(data);
        
    if(head==null){
        head=tail=newNode;
        tail.next=head;
        size++;
      return;
    }
   tail.next=newNode;
   size++;
    newNode.next=head;
    tail=newNode;
}

public static void deleteFirst(){
    if(head==null){
        System.out.println("LinkedList is empty");
        return;
    }
    if(head==tail){
        int data=head.data;
        System.out.println("deleted data "+data);
head=tail=null;
size--;
    }
    int data=head.data;
    System.out.println("deleted data "+data);
    head=head.next;
    size--;
    tail.next=head;

}

public static void deleteLast(){
    if(head==null){
        System.out.println("LinkedList is empty");
    }
    if(head==tail){
int data=head.data;
System.out.println("deleted data "+data);
        head=tail=null;
size--;
return;
    }
   Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
int data=temp.next.data;
size--;
System.out.println("deleted data "+data);
        tail=temp;
temp.next=head;
}

 public static  void print(){
if(head == null){
        System.out.print("LinkedList is empty");
        return;
    }

    Node temp=head.next;
System.out.print(head.data+" ");
do {
    System.out.print(temp.data+" ");
    temp=temp.next;
} while (temp!=head);
}

public static void main(String[] args) {
addFirst(4);
addFirst(3);
addFirst(2);
addFirst(1);
addLast(6);
addLast(7);

deleteLast();
deleteFirst();
circular.print();
deleteLast();


 
circular.print();
}



}
