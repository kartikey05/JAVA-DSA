public class IsPowerTwo{
    public static void main(String args[]){
        
        System.out.println("Number is True means it is a power of two: "+isPowerTwo(8));
    }
    public static boolean isPowerTwo(int n){
        return (n&(n-1))==0;
    }
}