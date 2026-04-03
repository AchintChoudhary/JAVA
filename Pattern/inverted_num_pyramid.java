public class inverted_num_pyramid {
     public static void main(String[] args) {
       int n=6;
       //Method 1
  for(int i=0;i<n;i++){
    for(int j=1;j<=n-i;j++){
      System.out.print(j);
    }
    System.out.println();
  }

//Method 2
   for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i+1;j++){
      System.out.print(j);
    }
    System.out.println();
  }
  }
}
