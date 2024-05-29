import java.util.Scanner;

class Ethanol{
    int C,V;
    int V_U;
    Ethanol(int C,int V){
        this.C = C;
        this.V = V;
    }
    void printInfo(){
        System.out.print("Ethanol "+C+"%"+" "+"("+V_U+"ml."+"/"+V+"ml.)");
        
    }
    void used(int V_U){
        this.V_U=V_U;
    }
}
public class Ethanol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int V = sc.nextInt();
        int V_U = sc.nextInt();
        Ethanol E = new Ethanol(C, V);
        if(V-V_U>=0){
            E.used(V-V_U);
        }
        else{
            E.used(0);
        }
        E.printInfo();
    }
}
