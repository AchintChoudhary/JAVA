public class MaxMinFind {
    public static int getLargest(int arr[]){
        int max=Integer.MIN_VALUE; //- Infinity
        
        for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
        max=arr[i];
        }
}
    return max;
}
    

    public static int getSmallest(int arr[]){
int min=Integer.MAX_VALUE; //+ Infinity
for(int i=0;i<arr.length;i++){
if(min>arr[i]){
    min=arr[i];
    }
}
return min;
    }
    
    public static void main(String[] args){
    int arr[]={34,35,67,56,23,90,78};
    
    int max=getLargest(arr);
    int min=getSmallest(arr);

    System.out.println("Largest value in arr "+max);
    System.out.println("Smallest value in arr "+min);
        }
}
