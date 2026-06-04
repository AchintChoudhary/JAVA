import java.util.LinkedList;
public class JCF{
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll=new LinkedList<>();

        //Add
       ll.addFirst(1);
       ll.addLast(2);
ll.addLast(3);
System.out.println(ll);
       
//Remove
ll.removeFirst();
ll.removeLast();
System.out.println(ll);

}
}