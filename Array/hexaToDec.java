import java.util.Scanner;

public class hexaToDec {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex = "";
        
        int num = decimal;
        while (num > 0) {
            int remainder = num % 16;
            hex = hexDigits[remainder] + hex;
            num = num / 16;
        }
        
        System.out.println("Hexadecimal equivalent: " + hex);
     
    }
}
