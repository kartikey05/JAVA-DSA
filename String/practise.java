public class practise {
    public static void main(String args[]){
        // System.out.println("Total LowerCase Vowels are: "+lowercase("abcdefaa"));
        // Output1();
        // Output2();
        char str1[] = { 'g', 'r', 'a', 'm' };
		char str2[] = { 'g', 'r', 'a', 'm' };
        System.out.println(anagrams(str1,str2));
    }
    // public static int lowercase(String str){
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(ch=='a'||ch=='u'||ch=='o'||ch=='i'||ch=='e'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static void Output1(){
    //     String str="KartikeyAgarwal";
    //     String str1="India";
    //     String str2="KartikeyAgarwal";
    //     System.out.println(str.equals(str1)+" "+ str.equals(str2));
    // } 
    // public static void Output2(){
    //     String str="Rail".replace("l","");
    //     System.out.println(str);
    // }
    public static boolean anagrams(char[] str1, char[] str2){
        int n1 = str1.length;
		int n2 = str2.length;
        
        
        // char str1[] = { 'g', 'r', 'a', 'm' };
		// char str2[] = { 'a', 'r', 'm' };
		
        // If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Create an array to store the count of each character
		int[] count = new int[150];
        
		// Increment character count for each character in str1
		for (int i = 0; i < n1; i++) {
			count[str1[i]]++;
			count[str2[i]]--;
            //System.out.println("str2 "+count[str2[i]]);
		}
		// If the count array is all zeros, the strings are anagrams
		for (int i = 0; i < 150; i++) {
			if (count[i] != 0)
				return false;
		}

		return true;
    }
}
