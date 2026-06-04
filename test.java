import java.util.*;
public class test{
             public static String makeGood(String s) {
        StringBuilder str=new StringBuilder("");
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }     
if(Character.isUpperCase(ch) && Character.isLowerCase(st.peek())){
st.pop();
}else if(Character.isLowerCase(ch) && Character.isUpperCase(st.peek())){
st.pop();
}else{
    st.push(ch);
}
}
while(!st.isEmpty()){
    str.append(st.peek());
    st.pop();
}

       return str.toString(); 
    }

    public static void main(String[] args) {
 String s="leEeetcode";
 String result=makeGood(s);
 for (int i = 0; i < result.length(); i++) {
     System.out.print(result+" ");
 }
    }
}