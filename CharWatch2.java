import java.util.Scanner;

public class CharWatch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String X = s.nextLine();
        char c1 = X.charAt(0);
        char c2 = X.charAt(2);
        char c3 = X.charAt(4);
        int K = s.nextInt();
        int Black = 0;
        int Red = 0;
        int Green =0;
        String[] Str = new String[K];
        int[] L = new int[K];
        int max_l = -100000;
        for(int i=0;i<K;i++){
            Str[i] = s.nextLine();
             L[i] = Str[i].length(); // lenght
             if(L[i]>max_l){
                max_l=L[i];
             }
        }
        int N = s.nextInt();
        for(int i=0;i<N;i++){
            int w = s.nextInt();
            if(w<=0 || w > max_l ){
                Black++;
            }
            else if(charAt();){

            }
        }
        
    }
}
