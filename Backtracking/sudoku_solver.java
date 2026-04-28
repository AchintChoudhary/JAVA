

public class sudoku_solver {

public static boolean isSafe(int[][] board,int row,int col,int digit){
    //check verticle
    for(int i=0;i<9;i++){
        if(board[i][col]==digit){
return false;
        }
        
    }
//check horizontal
for (int i = 0; i < 9; i++) {
   if(board[row][i]==digit){
return false;
        }  
}
//check grid
int startRow=(row/3)*3;
int startCol=(col/3)*3;
for(int i=startRow;i<startRow+3;i++){
    for(int j=startCol;j<startCol+3;j++){
        if(board[i][j]==digit){
return false;
        } 
    }
}

return true;
}

public static boolean solve_sudoku(int[][] board,int row,int col){
   //base case
    if(row==9){
        return true;
    }

    //recursion
int nextRow=row,nextCol=col+1;
if(col+1==9){
    nextRow=row+1;
    nextCol=0;
}

if(board[row][col]!=0){
  return solve_sudoku(board, nextRow, nextCol);
}
for(int digit=1;digit<=9;digit++){
        if(isSafe(board,row,col,digit)){
            board[row][col]=digit;
          if(solve_sudoku(board, nextRow, nextCol)){
                return true;
            }
            board[row][col]=0;
        }
    }

    return false;

}

public static void print_sudoku(int[][] sudoku){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int[][] board={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        boolean result=solve_sudoku(board,0,0);
    if(result){
        System.out.println("Solution exist");
    }else{
        System.out.println("solution doesn't exist");
    }
    print_sudoku(board);
    }
}
