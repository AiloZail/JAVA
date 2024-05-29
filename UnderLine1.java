import java.util.Scanner;

public class UnderLine1 {
    static void UnderLine1(){
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String Name[] = new String[N+1];
        for(int i=1;i<=N;i++){
            Name[i]=sc.next();
        }
        for(int i=1;i<=N;i++){
            System.out.println(Name[i]);
            UnderLine1();
        }
        
    }
}
