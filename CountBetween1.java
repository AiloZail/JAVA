import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = s.nextInt();
        }
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int count_x = 0;
        int y1 = s.nextInt();
        int y2 = s.nextInt();
        int count_y = 0;
        int count_l = 0;
        for (int i = 0; i < N; i++) {
            if (num[i] >= x1 && num[i] <= x2) {
                count_x++;
            }
            if (num[i] >= y1 && num[i] <= y2) {
                count_y++;
            }
        }
        System.out.println(count_x);
        System.out.println(count_y);
        System.out.println(N - count_x - count_y);
    }
}
