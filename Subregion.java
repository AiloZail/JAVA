import java.util.Scanner;

public class Subregion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int num[][] = new int[R][C];
        // for(int r= 0;r<R;r++){
        //     for(int c= 0;c<C;c++){
        //         System.out.print(num[r][c]+" ");
        //     }
        //     System.out.println();
        // }
        int P =sc.nextInt()-1; //start,
        int Q =sc.nextInt()-1; //1 ,0
        int H = sc.nextInt(); 
        int W = sc.nextInt();
        if(P+H>R || Q+W>C){
            System.out.println("invalid input");
            return;
        }
        else if(P<0 || Q<0 ){
            System.out.println("invalid input");
            return;
        }
        for(int p=P;p<P+H;p++){
            for(int q=Q;q<Q+W;q++ ){
                num[p][q]=1;
            }
        }
        for(int r= 0;r<R;r++){
            for(int c= 0;c<C;c++){
                System.out.print(num[r][c]+" ");
           }
           System.out.println();
         }
        
    }
}
