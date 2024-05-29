import java.util.Scanner;

public class ArrayExploration1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int num[][] = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                num[r][c]=sc.nextInt();
            }
        }
        int K =sc.nextInt();
            int count_p =0;
            int count_m = 0;
            int count_2 =0;
            int count_1 =0;
        for(int i =0;i<K;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r-1<0 || c-1<0){
                
                continue;
            }
            else if(r-1>=R || c-1>=C){
                continue;
            }
            else{
                //System.out.println(num[r-1][c-1]);

                if(num[r-1][c-1]>0){
                    count_p++;
                }
                if(num[r-1][c-1]<0){
                    count_m++;
                }
                if(num[r-1][c-1]%2==0){
                    count_2++;
                }
                else{
                    count_1++;
                }
            }
        }
        System.out.print(count_p+" ");
        System.out.print(count_m+" ");
        System.out.print(count_2+" ");
        System.out.print(count_1+" ");

    }
}
