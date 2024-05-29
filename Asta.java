import java.util.Scanner;

public class Asta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String ob = sc.nextLine();
    String read = sc.nextLine();
    String tran = sc.nextLine();
    String t_t_string="";
    String r_t_string="";

    if(read.equalsIgnoreCase("Asta")){
        for(int i=0;i<tran.length();i++){
            int A = tran.charAt(i);
            A=A+1;
            t_t_string=t_t_string+(char)A;
        }
        System.out.print(t_t_string);
    }
    else if(ob.equalsIgnoreCase("Asta") && read!="Asta"){
        for(int i=0;i<tran.length();i++){
            int A = tran.charAt(i);
            A=A+1;
            t_t_string=t_t_string+(char)A;
        }
        System.out.print(t_t_string);
    }
    
    else if(ob.equalsIgnoreCase(read)){
        System.out.println(tran);
    }
    // else if(ob=="Asta" && read!="Asta"){
    //     for(int i=0;i<tran.length();i++){
    //         int A = tran.charAt(i);
    //         A=A+1;
    //         t_t_string=t_t_string+(char)A;
    //     }
    //     System.out.print(t_t_string);
    // }
    else if(read!=ob){
        for(int i=0;i<tran.length();i++){
            int A  = tran.charAt(i);
            A=A-1;
            r_t_string=r_t_string+(char)A;
        }
        System.out.print(r_t_string);
        }
    }
}
