public class pairs_in_an_Array {
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                tp++;
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }System.out.println();

        }
        System.out.print(tp);

    }
}
