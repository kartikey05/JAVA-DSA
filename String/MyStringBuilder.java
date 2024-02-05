import java.util.*;
public class MyStringBuilder {
    //StringBuilder is an same data structure similar to string but the difference is we can edit this without creating its multiple values in heap
    // StringBuilder sb=new StringBuilder("ANy String");
    //StringBuilder is not an type of string but we can convert it into string by using function sb.toString();
    //we can use toString funnction for Capital Letter stared data type(Class)
    // Program which we write with the help of String we can define it with the help of StringBuilder
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
