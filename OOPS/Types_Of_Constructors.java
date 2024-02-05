package OOPS;

public class Types_Of_Constructors {
    // There are Three Types of Constructors
    //                         -Non-parameterized
    //                         -parameterized
    //                         -Copy Constructor 

    public static void main(String args[]){

        // Constructor overloading= You create an object and particular constructor which is suitable for that gets called automatically is called constructor overloading
        // Constructor overloading Is an Example of Polymorphism
        Student S1= new Student();
        Student S2= new Student("Kartikey Agarwal");
        Student S3= new Student(22);
        Student S4= new Student("Kartikey Agarwal", 22);


        S1.name="Kartikey";
        S1.roll=1;
        S1.Passwords="abcd";
        
        S1.marks[0]=100;
        S1.marks[1]=90;
        S1.marks[2]=80;
        // Copy Constructor
        Student S5= new Student(S1);
        S5.Passwords="XYZ"; 
    }
}
class Student{
    String name;
    int roll;
    String Passwords;
    int marks[];
    // Non-parameterized Constructor
    Student(){
        System.out.println("Constructor is called....");
    }

    // parameterized Constructor
    Student(String name){
        this.name=name;
        marks=new int[3];
    }
    Student(int roll){
        this.roll=roll;
        marks=new int[3];

    }
    Student(String name,int roll){
        this.roll=roll;
        this.name=name;
        marks=new int[3];
    }

    // Copy Constructor There is by default Copy Constructor in c++ but there is no default Copy Constructor in Java
    // The work of Copy Constructor is that suppose
    // YOu have Two Objects Obj1 and Obj2
    // now Obj1 is created and Obj2 we are creating 
    // At the time of Creating Obj2 Copy Constructor will Copy all the properties of Obj1 to Obj2

    //Copy Constructor 
    Student(Student S1){
        this.name=S1.name;
        this.roll=S1.roll;

        marks=new int[3];
        this.marks=S1.marks;
    }
}
