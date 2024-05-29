import java.util.Scanner;

public class CardPair1 {


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);


        for(int i=0;i<5;i++){
            String p1 = s.nextLine();
            String p2 = s.nextLine();
            char p1_1=p1.charAt(0);
            char p1_2=p1.charAt(1);
            char p2_1=p2.charAt(0);
            char p2_2=p2.charAt(1);
            char[] score = new char[5];
            if(p1_1<p1_2){
                p1_1 = p1_1;
            }
            else{
                p1_1 = p1_2;
            }
            if(p2_1<p2_2){
                p2_1= p2_1;
            }
            else{
                p2_1 = p2_2;
            }
            if((char)p1_1 > (char)p2_1){
                System.out.print('W');
            }
            else if(p1_1 == p2_1){
               System.out.print('D');
            }
            else{
                System.out.print('L');
            }
        }
    }
}
