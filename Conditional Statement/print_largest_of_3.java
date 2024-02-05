public class print_largest_of_3 {
    public static void main(String args[]){
        int a=1;
        int b=3;
        int c=6;
        if((a>=b)&&(a>=c)){
            System.out.println("largest number is a");
        }
        else if(b>=c){
            System.out.println("largest number is b");
        }
        else{
            System.out.println("largest number is c");
        }
    }
}
