import java.util.Scanner;

public class o{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        String use = "";
        if(N>0){
            System.out.println( str.substring(0,N));
        }

        else if(N<0){
            String sum_A = "";
            String sum_B = "";
            String use1 = "";
           int L = str.indexOf(" ");
           if(L==-1){
            for(int i =str.length()-1;i>=0;i--){
                char test = str.charAt(i);
               sum_A=sum_A+test;
            }
            System.out.println(sum_A);
            return;  
           }
            String A = str.substring(L+1);
            String B = str.substring(0,L);
            for(int i =A.length()-1;i>=0;i--){
                 char test = A.charAt(i);
                sum_A=sum_A+test;
            }
            for(int i=B.length()-1;i>=0;i--){
                char test = B.charAt(i);
                sum_B = sum_B+test;
            }
            String sum = sum_A+" "+sum_B;

             System.out.println(sum);
        }
        else{
            System.out.println(str);
        }
    }
}