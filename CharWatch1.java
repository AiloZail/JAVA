import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S1 = s.nextLine();
        char c1 = S1.charAt(0);
        char c2 = S1.charAt(2);
        char c3 = S1.charAt(4);
        String Str = s.nextLine();
        int l = Str.length();
        int RED = 0;
        int BLUE = 0;
        int GREEN =0;
        int BLACK =0;
        int N = s.nextInt();
        for(int i=0;i<N;i++){
            int sel = s.nextInt();
            if(sel-1 >= l || sel-1 < 0){
                BLACK++;
            }  
            else if(Str.charAt(sel-1) == c1){
                RED++;
            }
            else if(Str.charAt(sel-1) == c2){
                BLUE++;
            }
            else if(Str.charAt(sel-1) == c3){
                GREEN++;
            }
        }
        System.out.println(RED);
        System.out.println(BLUE);
        System.out.println(GREEN);
        System.out.println(BLACK);
    }
}
