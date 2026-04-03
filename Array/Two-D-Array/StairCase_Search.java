
public class StairCase_Search {

    public static boolean Search(int matrix[][], int key) {
        int row = 0;                                                 //Search in Matrix (2D Array)
        int col = matrix[0].length - 1;
        while (row < matrix.length && 0 <= col) {
            if (matrix[row][col] == key) {
                System.out.println("Key Found at : " + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                //(key<Cell value)
                //Left Move
                col--;
            } else {
                //(key>Cell Value)
                //Bottom Move
                row++;
            }

        }

        return false;
    }

    public static Boolean Search_two(int matrix[][], int key) {
        int col = 0;
        int row = matrix.length - 1;
        while (0 <= row && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println("Key Found at : " + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }

        }

        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        int key = 100;
        System.out.println(Search(matrix, key));
        System.out.println(Search_two(matrix, key));
    }
}
