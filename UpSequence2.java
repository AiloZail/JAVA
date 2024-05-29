import java.util.Scanner;

public class UpSequence2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Str = s.nextLine();
        Str= Str+" ";
        int L = Str.length();
        for(int i=1;i<L;i++){ //14 out
            char A = Str.charAt(i-1);
            char B = Str.charAt(i);
            if(A<B){
                System.out.print(A+"");
            }
            else{
                System.out.print(A+"\n");
            }
        }
    }
}
