
public class question_4 {
//String Compression        Asked in(Amazone,Oracle)
    public static String Compression(String str) {
        StringBuilder sb = new StringBuilder("");
//Time complexity----->O(n);
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);
            
    while (  i<str.length()-1 && ch == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(ch);
            if (1 < count) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(Compression(str));
    }
}
