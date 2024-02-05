public class Operations_Bitwise {
    public static void main(String args[]){

        int n=10;
        int i=2;

        System.out.println("Setting ith Bit: "+SetIthBit(n,i));
        System.out.println("Get Ith Bit: "+getIthBit(n,i));
        System.out.println("Clear Ith Bit: "+ClearIthBit(n,i));
        System.out.println("Update Ith Bit: "+updateIthBit(n,i,1));
        System.out.println("Clear I Bit: "+ClearIBits(15,2 ));
        System.out.println("Clear I to J Bit: "+cleari(15,2,3 ));

    }


    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }


    public static int SetIthBit(int n, int i){
        int bitMask=1<<i;   
        return n| bitMask;
    }


    public static int ClearIthBit(int n, int i){
        int bitMask=~(1<<i);
        return n&bitMask;
    }


    public static int updateIthBit(int n, int i, int newBit){
        //  if(newBit==0){
        //     return ClearIthBit(n, newBit);
        //  }
        //  else{
        //     return SetIthBit(n, newBit)    
        //  }
        n= ClearIthBit(n,i);
        int BitMask=newBit<<i;
        return n|BitMask;
    } 
     

    public static int ClearIBits(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static int cleari(int n, int i, int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask; 
    }
}
