import java.util.Scanner;

public class Grimoire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int N = sc.nextInt();
        String use = str;
        String use1 ="";
        String sum = "";
            String use2 = "";
            String use3 = "";
            int L = str.indexOf("#");
            String A = use.substring(L+1);
            use2 = use2+A;
            String E = use.substring(0,L);
            use3 = use3+E;
            // System.out.println(use3);
            if(N==1){
                for(int i=0;i<use2.length();i++){
                    int B = use2.charAt(i);
                    int X = B-1; 
                    sum = sum+(char)X;
                }
                for(int i=0;i<use3.length();i++){
                    int B = use3.charAt(i);
                    int X = B+1;
                    sum = sum+(char)X;
                }
            }
            if(N>1){
                for(int i=0;i<use2.length();i++){
                    int B = use2.charAt(i);
                    int X = B-N; 
                    sum = sum+(char)X;
                }
                for(int i=0;i<use3.length();i++){
                    int B = use3.charAt(i);
                    int X = B+N;
                    sum = sum+(char)X;
                }
            }
            System.out.println(sum);
        }
        
            
 
        
}
