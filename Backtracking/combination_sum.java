import java.util.*;
 public class combination_sum {
public static void  combination_Sum(int[] candidates,int i,List<Integer> combine, List<List<Integer>>result, int target){

if(target==0){
    result.add(new ArrayList<>(combine));
    return;
}
if(i==candidates.length || target<0){
return;
}

combine.add(candidates[i]);
// //single
// combination_Sum(candidates,i+1,combine, result, target-candidates[i]);


//multi
combination_Sum(candidates,i,combine, result, target-candidates[i]);
combine.remove(combine.size()-1); //backtracking
//exclude
combination_Sum(candidates,i+1,combine,result, target);


}



    public static  void combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        combination_Sum(candidates,0,new ArrayList<>(),result,target);
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr={1,2}; int target=8;
        combinationSum(arr, target);
    
    }
}