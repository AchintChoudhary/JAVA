import java.util.ArrayList;
import java.util.List;

public class pair_sum {
     public static void pairSum(int[] arr,int target,ArrayList<List<Integer>> result){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                ArrayList<Integer> temp=new ArrayList<>();
 temp.add(arr[start]);
 temp.add(arr[end]);
       result.add(temp);
  start++;
                end--;

            }
            else if(sum<target){
start++;
            }else{
                end--;
            }
            
        }
    }


    
    public static void main(String[] args) {
        ArrayList<List<Integer>> result=new ArrayList<>();
        int[] arr={1,2,3,4,5,6,7,8,9};
        pairSum(arr, 9,  result);
        System.out.println(result);
    }
}
