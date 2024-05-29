import java.util.Scanner;
public class SeparateCharactersAndNumbers {
static String split(String msg) {
    if(msg.length()<=0){
        return msg;
    }
    char A = msg.charAt(0);
    boolean check = Character.isDigit(A);
    if(Character.isDigit(A)==true){

    }
    
   
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String msg = sc.next();
String res = split(msg);
System.out.println(res);
}
}   