import java.util.Scanner;

public class FillGasTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num[][] = new int[N+1][N+1];
        for(int r=1;r<=N;r++){
            for(int c=1;c<=N;){
                num[r][c] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        for(int i = 0;i<M;i++){
            String size = sc.next();
            String dummy  =sc.nextLine();
            int start = sc.nextInt();
            int stop = sc.nextInt();
           if(size.equals("L")){
            System.out.println(350*num[start][stop]/60);
           }
           else if(size.equals("M")){
            System.out.println(270*num[start][stop]/60);
           }
           else if(size.equals("S")){
            System.out.println(200*num[start][stop]/60);
           }
        }
    }
}
