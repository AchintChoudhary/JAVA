import java.util.*;
public class stock_span {
    public static ArrayList<Integer> stock_span(Stack<Integer> st,int[] price){

ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<price.length;i++){

while(st.size()>0 &&  price[st.peek()]<=price[i]){
st.pop();
}

if(st.size()==0){
 arr.add(i+1);
}else{
   arr.add(i-st.peek()); 
}

st.push(i);
}

return arr;
    }
    public static void main(String[] args) {
        int[] price={100,80,60,70,60,75,85};
Stack<Integer> st=new Stack<>();
ArrayList<Integer> result=new ArrayList<>();       
result=stock_span(st, price);
System.out.println(result);
    }
}
