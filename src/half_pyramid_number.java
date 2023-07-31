/*half pyramid number:
1
1 2    
1 2 3
1 2 3 4
1 2 3 4 5
    to print this pattern following is the code--*/

public class half_pyramid_number {
    public static void main(String args[]){
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
