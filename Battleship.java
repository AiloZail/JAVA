import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] num= new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                num[r][c]=sc.nextInt();
            }
        }
        int K = sc.nextInt();
        System.out.println(K);
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                System.out.print(num[r][c]+" ");
            }
            System.out.println();
        }
    }
}
