
import java.util.Stack;

public class next_greater{
    
 public static void main(String[] args) {
 int[] arr={6,8,0,1,3};
 int[] nextGreater=new int[arr.length];
 Stack<Integer> st=new Stack<>();
    for(int i=arr.length-1;i>=0;i--){

while(!st.isEmpty() && st.peek()<=arr[i]){
    st.pop();
}
if(st.isEmpty()){
    nextGreater[i]=-1;
}else{
    nextGreater[i]=st.peek();
}

st.push(arr[i]);

    }

    for(int i=0;i<nextGreater.length;i++){
        System.out.print(nextGreater[i]+" ");
    }

    }
}