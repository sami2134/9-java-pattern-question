/*simple box * pattern :
* * * * *     
* * * * *
* * * * *
* * * * *

    to print this pattern following is the code--*/

public class Main {
    public static void main(String[] args) {
        int n=4;
        int m=5;

        System.out.printf("Hello and welcome!");


        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
