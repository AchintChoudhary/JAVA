
public class operation_on_bit {

    public static int Get_ith_bit(int n, int i) {
        int bitMask = 1 << i;
        System.out.println(bitMask);
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int set_ith_bit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear_ith_bit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int update_ith_bit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clear_ith_bit(n, i);
        } else {
            return set_ith_bit(n, i);
        }
    }

    public static int clear_last_ith_bit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int clear_ith_Range(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clear_ith_Range(15, 2, 5));
    }
}
