import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String x = s.nextLine();
       String y = s.nextLine();
       int out =(x.indexOf(y));
        if(out>=0){
            System.out.println(out+1);
        }   
        else{
            System.out.println("string not found");
        }
       
       
    }
}
