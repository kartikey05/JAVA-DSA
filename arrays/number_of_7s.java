package arrays;

public class number_of_7s {
    public static void main(String args[]){
        int[][] array={{1,2,7},{4,5,7}};
        int countof7=0;
        for(int i=0; i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==7){
                    countof7+=1;
                }
            }
        }
        System.out.print(countof7);
    }
}
