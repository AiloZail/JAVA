import java.util.Scanner;

class Bill{
    String pin,data;
    int size, price;
    double tax=0;
    double fee = 0;
    double stamp = 0;
    Bill(String pin,String data,int size,int price){
        this.pin = pin;
        this.data = data;
        this.size = size;
        this.price = price;
        double s_T = price*size;
        double tax = s_T*0.03;
        double fee = s_T*0.05;
        double stamp = s_T*0.01;
        this.tax = tax;
        this.fee = fee;
        this.stamp = stamp;

    }
    void printInfo(){
        System.out.println(this.pin+" "+this.data+" "+this.size+" "+this.price);
        double sum = this.tax+this.fee+this.stamp;
        System.out.println(this.tax+"+"+this.fee+"+"+this.stamp+"="+sum);
    }

}
public class LandFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Bill []B = new Bill[N];
        for(int i=0;i<N;i++){
            String name=sc.next();
            String data=sc.next();
            int  size = sc.nextInt();
            int price = sc.nextInt();
            B[i]=new Bill(name, data, size, price);
            B[i].printInfo();
        }
        
    }
}
