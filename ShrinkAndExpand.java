import java.util.Scanner;

public class ShrinkAndExpand {
    String shrinkAndExpand(String s) {
        if(s.length()==0){
            return "";
        }
        String  A = s.charAt(0)+"";
        if (s.length() == 1) {
            return A+A;
        }
        String  B = s.charAt(1)+"";
        if (A.equals(B)) {
            // System.out.println("A B :"+A+B);
            return A+shrinkAndExpand(s.substring(2));
        } else {
            // System.out.println("A2 B2:"+A+B);
            // System.out.println("String : "+s.substring(1));
            // System.out.println("ANS : "+A);
            return  A+A+shrinkAndExpand(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}