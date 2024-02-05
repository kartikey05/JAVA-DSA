import java.util.*;
public class IsEven {
    public static void main(String agrs[]){
        System.out.println("Enter your Number: ");
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        if(IsEven(Number)){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Not Even Number");
        }
    }
    public static boolean IsEven(Integer Number){
        if(Number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
