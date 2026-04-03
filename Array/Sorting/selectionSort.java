public class selectionSort {
    public static void sort(int arr[]){
 
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[minpos]>arr[j]){
                minpos=j;
               }
            }
            //Swap
            int temp=arr[i];
            arr[i]=arr[minpos];
             arr[minpos]=temp;
            
        }

    }
    public static void main(String[] args) {
        int arr[]={7,5,6,3,4,1,2};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
