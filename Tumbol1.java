import java.util.Scanner;

class Tumbol{
    String name;
    int num1,num2,N;
    int availBudget=N*5000;
    Tumbol(String name,int num1,int num2,int N){
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
        this.N = N;

    }
    void allocateBudget(int A[]){
        System.out.println(name);
    }
}
public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    String name = sc.next();
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int N = sc.nextInt();
    int A = sc.nextInt();
    int AD[] = new int[A];
    for(int i=0;i<A;i++){
        AD[i]=sc.nextInt();
    }
    }
}
