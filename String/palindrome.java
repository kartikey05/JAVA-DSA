package String;
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        int n=string.length();
        for(int i=0;i<(string.length())/2;i++){
            if(string.charAt(i)!=string.charAt(n-i-1)){
                System.out.print("it is not an palidorm");
            }
            
        }
        System.out.print("it is an palidorm");
    }
}

