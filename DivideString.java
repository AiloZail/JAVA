import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String Str = s.nextLine();
        int L = Str.length();
        char[] small = new char[1000]; 
        char[] big = new char[1000]; 
        char[] els = new char[1000]; 
        int c_small = 0;
        int c_big = 0;
        int c_els = 0;
        for(int i=0;i<L;i++){
            char check=Str.charAt(i);
            if(check>='a' && check <='z'){
                c_small++;
                small[i]= check;
            }
            else if(check>='A' && check <='Z'){
                c_big++;
                big[i]=  check;
            }
            else if(check >= '0' && check<= '9'){
                c_els++;
                els[i]= check;
            }
            else{
                c_els++;
                els[i]= check;
            }
            
        }
        for(int i=0;i<c_small;i++){
            System.out.print(small[i]+"");
        }
        System.out.print("\n");
        for(int i=0;i<c_big;i++){
            System.out.print(big[i]+"");
        }
        System.out.print("\n");
        for(int i=0;i<c_els;i++){
            System.out.print(els[i]+"");
        }
        System.out.print("\n");
    }
}
