
public class linearSearch {

    public static int linear_Search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int key = 8;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int in = linear_Search(arr, key);
        if (in == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key at indedx : " + in);
        }
    }

}
