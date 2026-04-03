public class SubArray {
    public static void Sub_Array(int arr[]){
       int maxsum=Integer.MIN_VALUE;
        int curr=0,end=arr.length;
            for (int i = curr; i < end; i++) {
         for(int j=i;j<end;j++){
            int sum=0;
        for(int k=i;k<=j;k++){
            sum+=arr[k];
            System.out.print("|"+arr[k]+"|");
        }
        maxsum=Math.max(maxsum, sum);

        System.out.print(" / ");
        } 
        System.out.println();  
        }
        System.out.println(maxsum);
        }
        
        public static void main(String[] args) {
            int arr[]={2,-4,6,-2,10};
        Sub_Array(arr);
        }
}
