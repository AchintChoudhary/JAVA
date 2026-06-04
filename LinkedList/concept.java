class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class concept{
    public static void main(String[] args) {
        Node obj1=new Node(20);    //(data:20 | next:null)
        Node obj2=new Node(30); //(data:30 | next:null)
/*So now memory looks like:
obj1 → (20 | null)

obj2 → (30 | null)*/

        obj2.next=obj1;//(data:30 | next:obj1)
        Node head=obj1;// head=obj1;
        System.out.println(obj2.data);
        System.out.println(head.data);
    }
}
