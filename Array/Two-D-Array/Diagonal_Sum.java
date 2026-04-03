public class Diagonal_Sum {
     //IMPORTANT Question for Google,Microsoft,Airbnd,oracle (already Asked)

     public static void Diagonal_Addition(int [][] matrix) {

        //Time Complexity---->O(n^2);
        //    int PrimarySum=0;
//    int SecondarySum=0;
//   for(int i=0;i<matrix.length;i++){
//     for(int j=0;j<matrix[0].length;j++){
//         if(i==j){
// PrimarySum+=matrix[i][j];
//             }
//             if((i+j)==matrix.length-1){
// SecondarySum+=matrix[i][j];
//             }
//     }
//   }
//   System.out.println(PrimarySum+" "+SecondarySum);


//Optimal Solution Time Complexity--->O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //Primary sum
            sum += matrix[i][i];
            //Secondary Sum
            if (i != matrix.length - 1 - i) {  //these 'If' condition is  true --where 'i' Not Equal to J 
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Diagonal Sum of Matrix is : " + sum);

    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
        {5, 6, 7},
        {9, 10, 11},};

        Diagonal_Addition(matrix);
    }
}
