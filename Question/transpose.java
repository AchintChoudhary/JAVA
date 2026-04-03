public class transpose {
     public static void main(String[] args) {
    int col=3,row=2;
    int matrix[][]={{2,34,5},{6,7,90}}; //2 x 3

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
        }
    }

int transpose[][]=new int[col][row]; //3 x 2

for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
transpose[j][i]=matrix[i][j];
    }
}
 System.out.println();
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[0].length;j++){
            System.out.print(transpose[i][j]+" ");
        }
    }

  }
}
