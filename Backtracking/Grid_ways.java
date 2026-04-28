public class Grid_ways{
    
public static int count_ways(int i,int j,int m,int n){
if(i==m-1 && j==n-1){  //Base Case
    return 1;
}else if(i==m || j==n){ //Boundary Case
    return 0;
}
return count_ways(i+1, j, m, n)+count_ways(i, j+1, m, n);
} 

    public static void main(String[] args) {
  int m=3,n=7;
       int result= count_ways(0, 0, m, n);  
       System.out.println("Total ways to reach destination ="+result);  
    }
}
