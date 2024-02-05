public class max_sum {
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=0;j<numbers.length;j++){
            int end=j;
            currsum=0;
            for(int k=start; k<=end; k++){
            
                currsum+=numbers[k];

            }if(maxsum<currsum){
                maxsum=currsum;
            }
        }
    }System.out.println(maxsum);

}
}
