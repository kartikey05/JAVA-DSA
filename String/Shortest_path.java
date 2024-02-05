import java.util.*;
public class Shortest_path{
    public static void main(String args[]){
        int x=0,y=0;
        String path="WNEENESENNN";
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        System.out.println(Math.sqrt(Y2+X2));
    }
}


