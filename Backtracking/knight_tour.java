public class knight_tour{
    public static boolean knight_configure(int[][] grid,int row,int col,int expectedVal){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]!=expectedVal ){
            return false;
        }
        if(expectedVal==grid.length*grid[0].length-1){
            return true;
        }
        boolean ans1=knight_configure( grid,row-2,col+1,expectedVal+1);
boolean ans2=knight_configure( grid,row-1, col+2,expectedVal+1);
boolean ans3=knight_configure(grid,row+1,col+2, expectedVal+1);
boolean ans4=knight_configure(grid,row+2,col+1, expectedVal+1);
boolean ans5=knight_configure(grid,row+2,col-1, expectedVal+1);
boolean ans6=knight_configure(grid,row+1,col-2, expectedVal+1);
boolean ans7=knight_configure(grid,row-1,col-2, expectedVal+1);
boolean ans8=knight_configure(grid,row-2,col-1, expectedVal+1);
return ans1 || ans2||ans3||ans4||ans5||ans6||ans7||ans8;
    }
    public static void main(String[] args) {
        int[][] arr={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        boolean result=knight_configure(arr, 0, 0, 0);
    System.out.println(result);
    }
}