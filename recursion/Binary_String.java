
public class Binary_String {
    //Print all Binary string of size N without consecutive one----->

    public static void print_Binary_str(int n, int lastPlace, String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }

        print_Binary_str(n - 1, 0, str+"0");
        
        if (lastPlace == 0) {
            print_Binary_str(n - 1, 1, str+"1");
        }

    
    }

    public static void main(String[] args) {
print_Binary_str(5, 0, "");
    }
}
