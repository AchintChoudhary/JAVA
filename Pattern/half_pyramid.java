class half_pyramid{
    public static void main(String[] args) {


int n=5;

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
if(j<=n-i){
System.out.print(" ");
}else{
  System.out.print("*");
}
      }
      System.out.println();
    }


for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}

}
  
}

/*Both are O(n²) (same asymptotic complexity).

But Code 2 executes faster in practice, because:

It avoids the if check inside the inner loop.

It uses simpler loops (fewer instructions).

The CPU can execute it more efficiently.*/

