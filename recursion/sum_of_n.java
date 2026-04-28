public class sum_of_n {
    public static int sumOf_n(int n){
        if(n==1){
            return 1;
        }
        return n+sumOf_n(n-1);
}
    public static void main(String[] args) {
        int result=sumOf_n(4);
System.out.println(result);
    }
}
