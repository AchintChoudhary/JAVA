public class Question11{
    
//INPUT: sorted,roted array with distinct number in ascending order .it is rotated at a point.find the index of given element
    public static int Search(int arr[], int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

//case FOUND
        if (arr[mid] == target) {
            return mid;
        }

//Mid on Line1
        if (arr[start] <= arr[mid]) {
            //Case a: Left
            if (arr[start] <= target && target <= arr[mid]) {
                return Search(arr, target, start, mid - 1);
            } else {
                //Case B: Right
                return Search(arr, target, mid + 1, end);
            }
        } 
        
        
        //Mid on Line2 arr[mid]<=arr[end] :
        else {
            //Case c:
            if (arr[mid] <= target && target <= arr[end]) {
                return Search(arr, target, mid + 1, end);
            } else {
//Case D:
                return Search(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
int arr[]={4,5,6,7,1,2,3};
System.out.println(Search(arr, 2, 0, arr.length-1));
    }
}