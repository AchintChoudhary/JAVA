public class binaryTodec {
    public static void convert(int n){
        int count=0,lastDigit,ans=0;
        while(n>0){
        lastDigit=n%10;
        ans+=lastDigit*(Math.pow(2, count));
        n/=10;
        count++;
        }
        System.out.print(ans);
        }
        
          public static void main(String args[]){
          
        convert(101);
          }
        
}
