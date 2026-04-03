public class shortest_path {
    //Given a route containing 4 directions (E,W,N,S),
    //FIND THE SHORTEST PATH TO REACH DESTINATION

    public static void Shortest_path(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            //West
            if (str.charAt(i) == 'W') {
                x--;
            } 
            //East
            else if (str.charAt(i) == 'E') {
                x++;
            }
            //North 
            else if (str.charAt(i) == 'N') {
                y++;
            } 
            //South
            else {
                y--;
            }
        }
        int sum = (int) (Math.pow(x, 2) + Math.pow(y, 2));
        double Shortpath = Math.sqrt(sum);
        System.out.println(Shortpath);
    }

    public static void main(String[] args) {
        String str = "NS";
        Shortest_path(str);
    }

}
