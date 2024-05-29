import java.util.Scanner;

class Encoder{
    String str[];
    int num[];
    Encoder(String[] str ,int[] num){
        this.str = java.util.Arrays.copyOf(str, str.length);
        this.num = java.util.Arrays.copyOf(num,num.length);
    }
   private int encodeWord(String str){
        for(int i=0;i<num.length;i++){
            if(str.equals(this.str[i])==true){
                return num[i];
            }
        }
        return -1;   
    }
    int[] encodeMsg(String msg[]){
        int numre[] = new int[msg.length];
        for(int i=0;i<msg.length;i++){
           numre[i]=encodeWord(msg[i]);
        }
        return numre;
     }
    }
class Decoder{
    String str[];
    int num[];
    Decoder(String[] str,int[] num){
        this.str = java.util.Arrays.copyOf(str, str.length);
        this.num = java.util.Arrays.copyOf(num,num.length);
    }
    private String decodeWord(int num){
        for(int i=0;i<this.num.length;i++){
            if(num==this.num[i]){
                return this.str[i];
            }
        }
        return "?";   
    }
    String[] decodeMsg(int[] A){
       String msg1[] = new String[A.length];
       for(int i=0;i<A.length;i++){
           msg1[i]=decodeWord(A[i]);
       }
       return msg1;
    }

}
  
    // void print(){
    //     for(int i=0;i<str.length;i++){
    //        System.out.println(this.str[i]+" "+this.num[i]);
    //     }
    // }
  


public class EnDecoder1 {
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            String str[] = new String[N];
            int num[] = new int[N];
            for(int i =0;i<N;i++){
                str[i] = sc.next();
            }
            for(int i =0;i<N;i++){
                num[i] = sc.nextInt();
            }
            Encoder En = new Encoder(str, num);
            int K = sc.nextInt();
            String str1[] = new String[K];
            for(int i=0;i<K;i++){   
                str1[i]=sc.next();
            }
            int A[] = En.encodeMsg(str1);
            // System.out.println(A.length);
            // for(int i=0;i<A.length;i++){
            //     System.out.print(A[i]+" ");
            // }
            // En.print();
            Decoder De = new Decoder(str, num);
            String msg[]=De.decodeMsg(A);
            for(int i=0;i<msg.length;i++){
                System.out.print(msg[i]+" ");
            }
        }
}
