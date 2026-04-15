
public class book_allocation {

    public static boolean isValid(int[] arr,int n,int m,int maxPageAllowed){
int student=1,pages=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxPageAllowed){
                return false;
            }
    if((pages+arr[i])<=maxPageAllowed){
       pages+=arr[i]; 
    }else{
        student++;
        pages=arr[i];
    }
}
return  m >= student;
    }
public static int book_allocate(int[] arr,int n,int m){
    int start=0,end=0,ans=-1;
if(m>n){
    return -1;
}

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
  int arr[]={2,1,3,4};
  int result=book_allocate(arr, 4, 2);
System.out.println(result);
}    
}
