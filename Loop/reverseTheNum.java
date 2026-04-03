


public class reverseTheNum {
    
    public static void main(String[] args) {
//       int num=10899;
//       int remain;                            //First number
//       while(num>0){
// remain=num%10;                             //In these 'print the reverse of a number '
// System.out.print(remain);         
// num/=10;
// }

 
 //Second Method
int lastDigit,reverse = 0;
int n=10899;
while(n>0){                                     //In these 'reverse the same number which is given'
lastDigit=n%10;
reverse=(reverse*10)+lastDigit;
n/=10;
}
System.out.print(reverse);  
    }
     
}
