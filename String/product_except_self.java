public class product_except_self {
    //leetcode problem 238
     public static int[] productExceptSelf(int[] nums) {
        
     int ans[]=new int[nums.length];

ans[0]=1;
        
    for(int i=1;i<nums.length;i++){
        ans[i]=ans[i-1]*nums[i-1];

        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
   ans[i]*=suffix;         
suffix=nums[i]*suffix;

        }

return ans;
    }

 public static void main(String[] args) {
        int array[]={4,2,3,4};
       int result[]= productExceptSelf(array);
       for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
       }
    }
}
