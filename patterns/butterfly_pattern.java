public class butterfly_pattern {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("x");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("x");
            }System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("x");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("x");
            }System.out.println();
        }
    }
}
