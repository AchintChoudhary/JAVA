class return_array{
       public static int[] change(){                 // Method that returns an array of integers
        int marks[]={43,54,5,6};
        return marks;
    }
    public static void main(String[] args) {

int[] marks=change(); // call the method

  // Print the array
for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);
}


    }
}