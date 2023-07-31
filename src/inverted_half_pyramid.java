/* Inverted Half pyramid-
      *
    * *  
  * * *
* * * *

    to print this pattern following is the code--*/


public class inverted_half_pyramid {
    public static void main(String args[]){
        int n=5;

        for(int i=1;i<=n;i++){

            //loop for space printing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //loop for star printing
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
