import java.util.Arrays;

class cow_agressive_problem{
public static boolean isPossible(int[] arr,int n,int c,int minAllowedDist){
  
  int cows=1,lastStallPos=arr[0];
    for(int i=1;i<arr.length;i++){
if((arr[i]-lastStallPos)>=minAllowedDist){
    cows++;
    lastStallPos=arr[i];
}
if(cows==c){
    return true;
}
   } 
    return false ;
}
public static  int cow_agressive(int[] arr,int n,int c){
    int start=1;
    int end=Integer.MIN_VALUE;
    int minInArr=Integer.MAX_VALUE;
   for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minInArr) {
                minInArr = arr[i];
            } else if (arr[i] > end) {
                end = arr[i];
            }
        }
        int ans=0;
        end=end-minInArr;
        Arrays.sort(arr);
while(start<=end){
    int mid=start+(end-start)/2;
    if(isPossible(arr,n,c,mid)){
        ans=mid;
        start=mid+1;
    }else{
        end=mid-1;
    }
}
    return ans;
}

    public static void main(String[] args) {
    int arr[]={1,2,8,4,9};
        int result=cow_agressive(arr,arr.length,3);
        System.out.println(result);
}
}