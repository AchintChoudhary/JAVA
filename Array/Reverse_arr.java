public class Reverse_arr {
   //method---1
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
            while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
            }
        
           
        }

//method-----2
 public static void change(int arr[]){
        for(int i=0;i<arr.length/2;i++){
    int temp=arr[arr.length-(i+1)];
    arr[arr.length-(i+1)]=arr[i];
    arr[i]=temp;
}
    }

        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8};
            reverse(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
