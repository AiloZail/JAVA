import java.util.Scanner;

public class NumTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int count = 0;
        int r1 = 0;
        int c1 = 0;
        int num[][] = new int[R + 1][C + 1];
        num[0][0] = 10;
        for (int r = 1; r <= R; r++) {
            for (int c = 1; c <= C; c++) {
                num[r][c] = sc.nextInt();
            }
        }
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int R_1 = sc.nextInt();
            int C_1 = sc.nextInt();

            if (R_1 <= 0 || C_1 <= 0) {
                if (count == 1) {
                    count=0;
                    continue;
                }
                else if(count == 0){
                    System.out.println();
                    count=1;
                }
            } else if (R_1 > R || C_1 > C) {
                 if (count == 1) {
                    count=0;
                    continue;
                }
                else if(count == 0){
                    System.out.println();
                    count=1;
                }
            } else if (num[R_1][C_1] == num[r1][c1]) {
                System.out.print("*");
                count=0;
            } else if (R_1 > 0 && R_1 <= R) {
                System.out.print(num[R_1][C_1]);
                r1 = R_1;
                c1 = C_1;
                count=0;
            }
            // System.out.println(count);
        }
    }
}
