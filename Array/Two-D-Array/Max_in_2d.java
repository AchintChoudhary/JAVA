public class Max_in_2d {
     public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,3},{7,8,90}};
int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[0].length;j++){
if(max<arr[i][j]){
    max=arr[i][j];
}

}
        
    }
System.out.println(max);

}
}
