
import java.util.Stack;

public class duplicate_parantheses{

public static boolean duplicateParantheses(Stack<Character> st,String s){
  for(int i=0;i<s.length();i++){
char ch=s.charAt(i);

if(ch!=')'){
st.push(ch);
}else{
int count=0;
 while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }
if(count==0){
    return true;
}
st.pop(); 
}

      }     
      return false;
    }

    public static void main(String[] args) {
      String s="(a)";
      Stack<Character> st=new Stack<>();
        boolean result= duplicateParantheses(st, s);
System.out.println(result);
    }
}