import java.util.Scanner;

public class UnderLine2 {
    static void UnderLine(int x){
        for(int i=1;i<=x;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Name[] = new String[N+1];
        int Line[] = new int[N+1];
        for(int i=1;i<=N;i++){
            Name[i]=sc.next();
            Line[i]=sc.nextInt();
        }
        for(int i=1;i<=N;i++){
            System.out.println(Name[i]);
            UnderLine(Line[i]);
        }
    }
}
