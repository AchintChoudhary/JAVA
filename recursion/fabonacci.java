public class fabonacci {
    
    public static int fabo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fabo(n-1)+fabo(n-2);
    }
    
    public static void main(String[] args) {
       int result= fabo(50);
       System.out.println(result);
    }
}
