
import java.util.HashMap;

public class largest_subArray_sum_zero {

public static int largest_subArray(int[] arr){
   
HashMap<Integer,Integer> hm=new HashMap<>();
//<sum,idx>
int length=0,sum=0;    
for(int j=0;j<arr.length;j++){
    sum+=arr[j];
    if(hm.containsKey(sum)){
length=Math.max(length,j-hm.get(sum));
    }else{
        hm.put(sum, j);
    }
}
return length;
}


    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
       int result= largest_subArray(arr);
System.out.println(result);
    }
}
