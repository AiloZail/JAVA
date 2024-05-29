import java.util.Scanner;
class Bus{
    String name;
    int type,seats;
    int current=0;
    boolean check=true;
    Bus(String name,int type,int seats){
        this.name = name;
        this.type = type;
        this.seats = seats;
    }
    boolean reserve(int k){
    this.current=this.current+k;
        if(k<=0 || this.current>seats){
            this.current=this.current-k;
            return false;
        }
        else{
            if(this.check==false){
                this.current=this.current-k;
            }
            return true;
        }
    }
    void sendToRepair(){
        this.check=false;
    }
    void  backToService(){
        this.check=true;

    }
    void printStats(){
        System.out.println(name);
        if(this.type==1){
            System.out.println("Fan");
        }
        else if(this.type==2){
            System.out.println("P1");
        }
        else if(this.type==3){
            System.out.println("VIP");
        }
        System.out.println(this.current+" "+this.seats);
        if(this.check==true){
            System.out.println("Active");
        }
        else if(this.check==false ){
            System.out.println("Inactive");
        }
       }
}
public class BusCompany2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String id = scan.next();
    int type = scan.nextInt();
    int seats = scan.nextInt();
    Bus b = new Bus(id, type, seats);
    int N = scan.nextInt();
    for(int i = 0; i < N; ++i) {
    int P = scan.nextInt();
    int K = scan.nextInt();
    if(P == 1)
        b.reserve(K);
    else if(P == 2)
        b.sendToRepair();
    else if(P == 3)
        b.backToService();
    b.printStats();
    }
    }
   }