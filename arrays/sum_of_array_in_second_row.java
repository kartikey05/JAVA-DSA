package arrays;

public class sum_of_array_in_second_row {
    public static void main(String args[]){
        int[][] array={{1,2,7},{4,5,7}};
        int sum=0;
        for(int i=0;i<array[0].length;i++){
            sum+=array[1][i];
        }
        System.out.println(sum);
    }
}
