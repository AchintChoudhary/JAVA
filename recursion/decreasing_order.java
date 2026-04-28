

public class decreasing_order {

public static void dec_order(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.println(n);
    dec_order(n-1);

}


    public static void main(String[] args) {
    dec_order(8);
}    
}
