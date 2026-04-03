
public class decToBinary{
    
   public static void convert(int n){
    int remainder,count=0;
int bin=0; 
while(n>0){
 remainder=n%2;

 bin=(int)(bin+(remainder*Math.pow(10, count)));
 n/=2;
 count++;
}
System.out.print(bin);

}

  public static void main(String args[]){
  
convert(8);
  }
}
