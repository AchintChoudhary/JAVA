
public class fast_exponentiation {

    //Fast Exponentiation
    public static int fastExpo(int a, int n) {
                //Time complexity------>O(logN);
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { //Check LSB
                ans = ans * a;
            }
            a = a * a;
//Shift LSB
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(5, 2));
    }
}
