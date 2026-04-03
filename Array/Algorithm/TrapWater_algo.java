public class TrapWater_algo {
    public static void calculate_rainWater(int arr[]){
        //Time complexity-----o(n);
          //Left Max Boundary
          int left[]=new int[arr.length];
          left[0]=arr[0];
          for(int i=1;i<arr.length;i++){
              left[i]=Math.max(arr[i], left[i-1]);
              System.out.print(left[i]+" ");
          }
  System.out.println();
          //Right Max boudary
          int right[]=new int[arr.length];
          right[arr.length-1]=arr[arr.length-1];
  for(int j=arr.length-2;j>=0;j--){
      right[j]=Math.max(arr[j],right[j+1]);
     
  }

  for(int i=0;i<arr.length;i++){
    System.out.print(right[i]+" ");
  }

  
  //Calculate Trap Water 
  int sum=0;
  
  for(int k=0;k<arr.length;k++){
      int min=Math.min(right[k], left[k]);
      
  sum+=(min-arr[k])*1;

  }
  
  System.out.println("Total Rain Water Trap : "+sum);               
          }
  
  public static void main(String[] args) {
      int arr[]={4,2,0,6,3,2,7};
      calculate_rainWater(arr);
  }   
}
