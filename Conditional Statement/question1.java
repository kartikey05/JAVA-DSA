import java.util.*;
public class question1 {
    public static void main(String args[]){
        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int even=0,odd=0;
        Scanner sc= new Scanner(System.in);
        int number;
        do{
            number =sc.nextInt();
            if(number%2==0){
                even+=number;
            }
            else{
                odd+=number;
            }
        }while(number!=0);
        System.out.println("even and odd number are: "+ even + " " + odd);
    }
}
