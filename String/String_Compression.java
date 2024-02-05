public class String_Compression{
    public static void main(String agrs[]){
        String str="aabbccc";
        System.out.println(Compress(str));
    }
    public static String Compress(String str){
        String NewStr="";
        for(int i=0;i<str.length();i++){
            Integer Count=1;
            while(i< str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                Count+=1;
                i++;
            }
            NewStr+=str.charAt(i);
            if(Count>1){
                NewStr+=Count.toString();
            }
            }
            return NewStr;
    }
}
//With The Help of String Builder
// public class String_Compression{
//     public static void main(String agrs[]){
//         String str="aabbccc";
//         System.out.println(Compress(str));
//     }
//     public static StringBuilder Compress(String str){
//         StringBuilder NewStr=new StringBuilder("");
//         for(int i=0;i<str.length();i++){
//             Integer Count=1;
//             while(i< str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                 Count+=1;
//                 i++;
//             }
//             NewStr.append(str.charAt(i));
//             if(Count>1){
//                 NewStr.append(Count.toString());
//             }
//             }
//             return NewStr;
//     }
// }
