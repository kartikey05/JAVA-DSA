public class Substring {
    public static void main(String args[]){
        // SUbstring is a subset of a String in contigous form
        String str="HelloWorld";
        System.out.println(substring(str, 0, 5));
        //There is an inbuilt function in java str.substring();
        System.out.println(str.substring(0,5));

    }
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
}
