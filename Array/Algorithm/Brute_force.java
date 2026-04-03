public class Brute_force {
    public static void Max_sum_subarray(int arr[]){
        //Brute Force Algorithm 
       // Time complexity--- o(n^3);
        int curr=0,end=arr.length,max=Integer.MIN_VALUE;
                for (int i = curr; i < end; i++) {
             for(int j=i;j<end;j++){
                int sum=0;
            for(int k=i;k<=j;k++){
          
           sum+=arr[k];
            }
            System.out.println(sum);
            if(max<sum){
                max=sum;   
        }
    } 
           
            }
            System.out.print("Maximum Sum of Subarray is : "+max);
    }
    
    
    
    
        public static void main(String args[]){
    int arr[]={2,4,6,8,10};
    Max_sum_subarray(arr);
    }
}
