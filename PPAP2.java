import java.util.Scanner;

public class PPAP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c_PP = 0;
        int c = 0;
        int c1 = 0;
        for(int i=0;i<str.length();i++){
           int out = str.indexOf("PPAP",c);
           int out1 = str.indexOf("GOD", c1);
           System.out.println("PPAP : "+out);
            System.out.println("GOD : "+out1);
            if(out<out1){
                c_PP++;
                c=out+3;
            }
            if(out>out1){
                c_PP--;
                c1=out1+3;
            }
            if(c_PP==2){
                System.out.println(out+4);
                break;
            }
        //    c=out+2;
        //    if(out>-1){
        //     c_PP++;
        //    }   
        }
        
        

    }
}
