public class kadanes_algo {
    //kedanes Algorithm
public static void max_subarray(int arr[]){
    int currsum=0,max=Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
currsum+=arr[i];
if(currsum<=0){
    currsum=0;
}
max=Math.max(currsum,max);

    }
System.out.print("Max value subarray is "+max);
}
public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    max_subarray(arr);
}
}
