
public class optimize_bubble {

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // If the array changes (at least one swap happens) in the /first pass, then it WILL go to the next pass.

                    // If the array does NOT change (no swap) in a pass, it will STOP.
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 12, 11};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
