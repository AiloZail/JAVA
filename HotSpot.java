import java.util.Scanner;

public class HotSpot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int num[][] = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                num[r][c]= sc.nextInt();
            }
        }
        
    }
}
