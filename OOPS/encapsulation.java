package OOPS;

public class encapsulation{
    public static void main(String argd[]){
        //Encapsulation is defined as the wrapping of data and methods under a single unit. it also implements data hiding.

        Person person = new Person();
        person.setName("Kartikey Agarwal");
        person.setAge(20);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());        

    }
    
}
class Person{
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}
