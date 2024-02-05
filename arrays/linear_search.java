import java.util.*;
public class linear_search {
     public static int linear_search_int(int numbers[],int key){

        for(int i=0; i<numbers.length; i++){
         if(numbers[i]==key){
            return i;
         }
        }
        return -1;

     }
     public static int linear_search_string(String string[],String key){
      for(int i=0; i<string.length; i++){
         if(string[i]==key){
            return i;
         }
        }
        return -1;

     }
     public static void main(String args[]){
      int numbers[]={2,4,6,8,10,12,14,16};
      int key=10;
      int index=linear_search_int(numbers,key);
      System.out.print(index);

      String string[]={"Hi","My","Name","Is","Kartikey","Agarwal"};
      String keys = "Kartikey";
      int indexs = linear_search_string(string, keys); 
      System.out.print(indexs);
     }


}
