
public class question {
    //Check String is Palindrom

    public static boolean isPalindrom(String x) {
        for (int i = 0; i < x.length() / 2; i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrom(str));
    }

}
