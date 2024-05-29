import java.util.Scanner;

public class UpSequence0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N+2];
        for(int i=1;i<=N;i++){
            A[i] = s.nextInt();
        }
        for(int i=1;i<=N;i++){
            if(A[i]>=A[i+1]){
                System.out.println(A[i]);
            }
        }
    }
}
