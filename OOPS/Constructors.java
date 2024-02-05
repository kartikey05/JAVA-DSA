package OOPS;
import java.util.*;
public class Constructors {
    // Constructor is a Special mehtod which is invoked automatically at the time of object creation.
    //     -Constructor hae the samne name as class or structure.
    //     -Constructor don't have a return typr (not even void)
    //     -Constructors are only called once, at object creation.
    //     -Memory allocation happens when constructors is called.
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String UserName= sc.nextLine();
        // After Running code Enter Your Name on Screen and press Enter 
        SayHello hi=new SayHello(UserName);
    }
}
class SayHello{
    SayHello(String UserName){
        System.out.println("Hello "+UserName);
    }
}
 