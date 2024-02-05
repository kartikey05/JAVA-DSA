public class Count_set_bit_in_a_number {
     public static void main(String args[]){
          int n=11;
          System.out.println(CountSet(n));
     }
     public static int CountSet(int n){
          int count =0;
          while(n>0){
               if((n&1)==1){
                    count=count+1;
               }
               n=n>>1;
          }
          return count;
     }
}
