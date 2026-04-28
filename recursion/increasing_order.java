
public class increasing_order {
    
    public static void inc_order(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        inc_order(n-1);
System.out.println(n );
    }


    
    public static void main(String[] args) {
    
        inc_order(5);
        
    }
}
