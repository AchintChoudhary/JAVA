import java.util.Scanner;

public class TWOD_Matrix {
    public static void main(String[] args) {
    int arr[][]=new int [3][4];
                     //  m x n (row x column)
         int n=3,m=4;            
Scanner sc=new Scanner(System.in);    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
//Print
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
}
}
}
