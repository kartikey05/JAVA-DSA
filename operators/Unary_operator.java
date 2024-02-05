public class Unary_operator {
    public static void main(String args[]){
        // Unary operator ++(increment),--(decrement)
        //pre increment ++a
        //post increment a++
        int a=5;
        int b=++a;
        System.out.println("Value of a and b= "+(a)+" "+b);
        int c=a++;
        System.out.println("Value of a and c= "+(a)+" "+c);
    }
}
