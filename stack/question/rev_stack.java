import java.util.Stack;

public class rev_stack{
    
public static void pushAtBottom(Stack<Integer> s,int num){
    if(s.isEmpty()){
        s.push(num);
        return;
    }
int top=s.pop();
pushAtBottom(s, num);
s.push(top);
}


public static void reverse_stack(Stack<Integer> s){
if(s.isEmpty()){
    return;
}

int top=s.pop();
reverse_stack(s);
pushAtBottom(s, top);

}




    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();    
s.push(3);
s.push(2);
s.push(1);

reverse_stack(s);
while(!s.isEmpty()){
    System.out.println(s.pop());
   
}
    }
}