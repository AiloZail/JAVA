import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String St1 = s.nextLine();
        String St2 = s.nextLine();
        int L1 = St1.length();
        int L2 = St2.length();
        int L_min=0;
        if(L1<L2){
            L_min= L1;
        }
        else if(L1>L2) {
            L_min =L2;
        }
        int w = s.nextInt();
        if(w==1){
            for(int i=0;i<L_min;i++){
                char w_St1=St1.charAt(i);
                char w_St2=St2.charAt(i);
                if(w_St1>='A' && w_St1 <='Z'){
                    System.out.print(w_St1+"");
                }
                else if(w_St1 >= 'a' && w_St1<='z'){
                    if(w_St2 >='A' && w_St2 <='Z'){
                        System.out.print(w_St2+"");
                    }
                    else if(w_St2 >= 'a' && w_St2<='z'){
                        System.out.print(w_St1+"");
                    }
                }
            }
        }
        else if(w==2){
            for(int i=0;i<L_min;i++){
                char w_St1=St1.charAt(i);
                char w_St2=St2.charAt(i);
                if(w_St2>='A' && w_St2 <='Z'){
                    System.out.print(w_St2+"");
                }
                else if(w_St2 >= 'a' && w_St2<='z'){
                    if(w_St1 >='A' && w_St1 <='Z'){
                        System.out.print(w_St1+"");
                    }
                    else if(w_St1 >= 'a' && w_St1<='z'){
                        System.out.print(w_St2+"");
                    }
                }
            }
        }
    }
}
