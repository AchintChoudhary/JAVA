public class painter_partition_problem {
public static boolean isValid(int[] arr,int n,int m,int maxTime){
   int time=0; int painter=1;
    for(int i=0;i<arr.length;i++){
  if(arr[i]>maxTime){
        return false;
    }
    if(time+arr[i]<=maxTime){
        time+=arr[i];   
    }else{
painter++;
        time=arr[i];
    }
    }

    return painter <= m ;
  
}

    public static int painter_partion(int[] arr,int n,int m){
if(m>n){
    return -1;
}
int start = 0;
for(int i = 0; i < arr.length; i++){
    start = Math.max(start, arr[i]);
}

int end=0,ans=0;

for(int i=0;i<arr.length;i++){
    end+=arr[i];
}
while(start<=end){
    int mid=start+(end-start)/2;
    if(isValid(arr,n,m,mid)){
       
       ans=mid;
        
        end=mid-1;
    }else{
       start=mid+1; 
    }
}

return ans;
    }
    public static void main(String[] args) {
        int arr[]={40,30,10,20};
        int result=painter_partion(arr, 4,2);
   System.out.println(result);
    }
}
