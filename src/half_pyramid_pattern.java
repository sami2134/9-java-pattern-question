public class half_pyramid_pattern {
    public static void main(String args[]){
        int n=4;
        //outer loopor for rows
        for(int i=1;i<=n;i++){
            //number of stars in row
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
