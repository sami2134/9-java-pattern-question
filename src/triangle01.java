public class triangle01 {
    public static void main(String args[]){
        int n = 5;
        int number=1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if(sum%2==0){//even then it is on
                    System.out.print("1 ");    //1=ON
                }else {//odd then it is off
                    System.out.print("0 ");    //0=OFF

                }

            }
            System.out.println();
        }
    }
}
