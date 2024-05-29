import java.util.Scanner;

public class IntToChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        char out = (char)in;
        if(out>='A' && out<='Z'){
            System.out.println(out);
        }
        else{
            System.out.println("unsupported code");
        }
    }
}
