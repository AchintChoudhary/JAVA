public class Pair {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        System.out.print("("+arr[i]+","+arr[j]+") ");
    }
    System.out.println();
        }
        
    }
    
    
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7};
        pair(arr);
    }
}


//output
// (2,3) (2,4) (2,5) (2,7) 
// (3,4) (3,5) (3,7)
// (4,5) (4,7)
// (5,7)