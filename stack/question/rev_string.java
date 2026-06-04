import java.util.*;
public class rev_string{
public static String reverse(Stack<Character> st,String s){
for(int i=0;i<s.length();i++){
    st.push(s.charAt(i));
}   
StringBuilder str=new StringBuilder("");
while(!st.isEmpty()){
    char ch=st.pop();
    str.append(ch);
}
return str.toString();
}
    public static void main(String[] args) {
    Stack<Character> st=new Stack<>();
        String result=reverse(st, "Hello");
        System.out.println(result);
}
}