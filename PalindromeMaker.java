import java.util.Scanner;

public class PalindromeMaker {
    String makePalindrome(String str) {
        if(str.length() <=0){
            return "";
        }
        String front = str.charAt(0)+"";
        if(str.length()==1){
            return  front;
        }
        String back  = str.charAt(str.length()-1)+"";
        if(front.equals(back)==true){
            // System.out.println("F : "+front+" mid : "+str.substring(1,str.length()-1)+" B : "+back);
            return front+makePalindrome(str.substring(1, str.length()-1))+back;
        }
        else{
            return makePalindrome(str.substring(1, str.length()-1));
        }
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String text = scan.next();
    PalindromeMaker maker = new PalindromeMaker();
    String result = maker.makePalindrome(text);
    System.out.println(result);
    }
   }