public class question_6 {
 
 
 public static int count_set_bit(int n){
    int count=0;
    while(n>0){
        if((n & 1)!=0){ //check LSB
            count++;
        }
        n=n>>1;
    }
    
    
    
    return  count;
 }

public static void main(String[] args) {
System.out.println(count_set_bit(3));     
 }   
}
