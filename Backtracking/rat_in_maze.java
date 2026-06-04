import java.util.ArrayList;
 public class rat_in_maze{
    
public static void count_ways(int[][] maze,int i,int j,int n,String path,ArrayList<String> result,boolean[][] visited){
if(i==n || j==n || i<0 || j<0 || maze[i][j]==0 || visited[i][j]==true){ //boundary
  return;
}
if(i==n-1 && j==n-1){  //Base Case
     result.add(path);
} 

visited[i][j]=true;

count_ways(maze,i-1,j,n,path+"U",result, visited); //up
count_ways(maze,i+1,j,n,path+"D",result, visited); //down
count_ways(maze,i,j+1,n,path+"R",result, visited); //right
count_ways(maze,i,j-1,n,path+"L",result, visited); //left
visited[i][j]=false; //Backtrack
}
public static void main(String[] args) {
   ArrayList<String> result=new ArrayList<>();
   int[][] maze={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
boolean[][] visited=new boolean[maze.length][maze.length];
   count_ways(maze, 0, 0, maze.length,"",result,visited);

   for (String path : result) {
    System.out.println(path);
   }
}
}