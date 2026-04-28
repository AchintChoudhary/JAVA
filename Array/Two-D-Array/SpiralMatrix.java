
public class SpiralMatrix {
    //IMPORTANT Question for Google,Microsoft,Airbnd,oracle (already Asked)

    public static void Spiral_matrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //Bottom 
            for (int j = endCol - 1; j >= startCol; j--) {
             //This element print in TOP, so don't print in bottom
                //This print, single last element , once time
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                //This element print in LEFT, so don't print in Right
                //This print, single last element , once time 
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

        Spiral_matrix(matrix);
    }
}
