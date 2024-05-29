import java.util.Scanner;

class Ethanol{
    int C,V,mL;
    int sum_V = V-mL;
    int sum=0;
    int V_ALL75 =0;
    int V_ALL95 =0;
    Ethanol(int C,int V,int mL){
        this.C = C;
        this.V = V;
        this.mL = mL;
    }
    void printInfo(){
        // System.out.print("Ethanol "+C+"%"+" "+"("+V_U+"ml."+"/"+V+"ml.)");
        
    }
    void used(int V_ALL75,int V_ALL95){
        this.V_ALL75 = V_ALL75;
        this.V_ALL95 = V_ALL95;
        if(this.C==75){
            this.V_ALL75=V_ALL75-sum_V;
        }
        else if(this.C==95){
            this.V_ALL95=V_ALL95-sum_V;
        }
    }
}
public class Ethanol2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Ethanol E[] = new Ethanol[N+1];
        for(int i =1;i<=N;i++){
            int C = sc.nextInt();
            int V = sc.nextInt();
            int mL = sc.nextInt();
            E[i] = new Ethanol(C, V,mL);
            
        }
        int V_ALL75 = sc.nextInt();
        int V_ALL95 = sc.nextInt();
        for(int i=1;i<=N;i++){
            E[i].used(V_ALL75, V_ALL95);
        }
        
    }
}