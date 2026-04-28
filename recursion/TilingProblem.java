
public class TilingProblem {
        //Tiling  Problem   <Amazone>
    public static int Tiling_problem(int n) { //Size  2 * n
//Base Case
if(n==0||n==1){
    return 1;
}

//Verticle
        int fnm1=Tiling_problem(n-1);

//Horizontal
int fnm2=Tiling_problem(n-2);

int Ways=fnm1+fnm2;
return Ways;

    }

    public static void main(String[] args) {
                                  //length
System.out.println(Tiling_problem(3));
    }
}
