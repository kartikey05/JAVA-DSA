import java.util.*;
public class palindrome {
    public static boolean Palindrome(int number_1){
        int reverse=0;
        int number=number_1;
        while(number!=0){
            reverse=reverse*10+number%10;
            number=number/10;
        }   
        if (number_1 == reverse) {
            return true;
            }
        else{
            return false;
        }
    }
    public static void main(String agrs[]){
        System.out.println("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if(Palindrome(number)){
            System.out.println(number+":is Palindrome ");
        }
        else{
            System.out.println(number +  " number is not palindrome ");
        }
    }
}
