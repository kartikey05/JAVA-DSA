import java.util.*;
public class avg_of_three_numbers {
    public static double average(double x,double y,double z){
        return (x+y+z)/3;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter FIrst Number: ");
        double first_number=sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double Second_number=sc.nextDouble();
        System.out.println("Enter Third Number: ");
        double third_number=sc.nextDouble();
        System.out.print("avg of Three numbers are: " + average(first_number,Second_number,third_number)+"\n");
    }
}
