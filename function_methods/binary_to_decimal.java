public class binary_to_decimal {
    public static void biToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decum=0;
        while(binNum>0){
            int lasDigit=binNum%10;
            decum=decum+lasDigit*(int)Math.pow(2, pow);
            pow++;
            binNum=binNum/10;

        }
        System.out.println("Decimal of"+ myNum+"="+decum);
    }
    public static void main(String args[]){
        biToDec(100);
    }
}
