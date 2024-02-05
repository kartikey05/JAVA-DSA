public class logical_operator {
    public static void main(String args[]){
        // &&(Logical and), ||(Logical OR), || !(Logical NOt)
        System.out.println("value return by && = "+((3>2)&&(5>0)));
        System.out.println("value return by && = "+((3<2)&&(5>0)));
        System.out.println("value return by || = "+((3>2)||(5<0)));
        System.out.println("value return by ! = "+!(3>2));
    }
}
