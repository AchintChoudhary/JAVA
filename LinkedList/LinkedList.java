
public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; //Reference variable
    public static Node tail; //Reference variable
    public static int size;

    public void AddFirst(int data) {
//step 1- create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

//step 2- newNode=head
        newNode.next = head;

//step 3-head=newNode
        head = newNode;

    }

    public void AddLast(int data) {
        //create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

//tail.next=newnode
        tail.next = newNode;

//tail=newnode
        tail = newNode;
    }

    public void addInMiddle(int idx, int data) {
        if (idx == 0) {
            AddFirst(data);
            return;
        }
        Node temp = head;
        size++;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        int data = head.data;

        head = head.next;
        size--;
        return data;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = tail.data;
            head = tail = null;
            size = 0;
            return data;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int data = temp.next.data;
        tail = temp;
        temp.next = null;
        size--;

        return data;

    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


public int ItrSearch(int key){
Node temp=head;
int i=0;
while(temp!=null){
    if(temp.data==key){
       return i;
    }
    temp=temp.next;
    i++;
}
    return -1;
}

public int helper( Node head,int key){
if(head==null){
    return -1;
}
if(head.data==key){
    return 0;
}
int idx=helper(head.next, key);
if(idx==-1){
    return -1;
}
return idx+1;
}
public int recursiveSearch(int key){
   return helper(head,key);
}    public static void main(String[] args) {
       
       
        LinkedList ll = new LinkedList();
        
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddLast(4);
        ll.AddLast(3);   //2--1--4--3
        // ll.print();

        ll.addInMiddle(2, 6);
        ll.print();
        //   int data= ll.removeFirst();
//  System.out.println("Removed first data : "+data);
// ll.print();
//  data=ll.removeLast();
// System.out.println("Removed last data : "+data);
// ll.print();
// System.out.println(size);
// int pos=ll.ItrSearch(3);
// System.out.println("Postion : "+pos);   
}
}
