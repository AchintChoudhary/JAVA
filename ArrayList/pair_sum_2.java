public class pair_sum_2 {
//Find pair sum in sorted and rotated array.
    public static int[] pair_sum(int[] arr,int target){
        int[] ans=new int[2];
for(int i=0;i<arr.length-1;i++){
if(arr[i]>arr[i+1]){
int start=i+1;
int end=i;
    while(start!=end){
int sum=arr[start]+arr[end];
if(sum==target){
ans[0]=start;
ans[1]=end;
start=(start+1)%arr.length;
end=(arr.length+end-1)%arr.length;
}else if(sum<target){
start=(start+1)%arr.length;
}else{
end=(arr.length+end-1)%arr.length;
}
    }


    }
}
return ans;
    }


    public static void main(String[] args) {
        int[] set={11,15,6,8,9};
        int arr[]=pair_sum(set, 17);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
