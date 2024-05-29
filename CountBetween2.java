import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String Str = s.nextLine();
        int L =Str.length();
        int small = 0;
        int big = 0;
        int els =0 ;
        for(int i=0 ; i<L ; i++){
            char check = Str.charAt(i);
            if(check >= 'A' && check <= 'Z'){
                big++;
            }
            else if(check >= 'a' && check <='z'){
                small++;
            }
            else{
                els++;
            }
        }
        System.out.println(small);
            System.out.println(big);
            System.out.println(els);
    }
}
