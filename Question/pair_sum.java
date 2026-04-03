public class pair_sum {
     public static int[] sum_pair(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int pairSum = arr[i] + arr[j];

            if (pairSum > target) {
                j--;
            } 
            else if (pairSum < target) {
                i++;
            } 
            else {
                return new int[]{i, j};   //CONCECPT---->In Java you cannot return two primitive values directly like (i, j).
            }
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
            int arr[] = {23, 24, 56, 78};                      //In sorted Array

        int[] ans = sum_pair(arr, 80);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
