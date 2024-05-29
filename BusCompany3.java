import java.util.Scanner;
class Bus{
    private int seats,current=0;
    private boolean Active=true;
    String name;
    int type;
    Bus(String name,int type,int seats ){
        this.name = name;
        this.type = type;
        this.seats = seats;
    }
    boolean reserve(int k){
        this.current=this.current+k;
            if(k<=0 || this.current>seats ){
                this.current=this.current-k;
                return false;
            }
            else{
                if(this.Active==false){
                    this.current=this.current-k;
                }
                return true;
            }
        }
        void sendToRepair(){
            this.Active=false;
        }
        void  backToService(){
            this.Active=true;
        }
        void Print(){
            if(this.Active==false){
                System.out.println("sorry");            
            }
            else if(this.Active==true){
                System.out.println(name);       
            }
        }
}
public class BusCompany3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Bus[] B = new Bus[Q+1];
        for(int i=1;i<=Q;i++){
            String name=sc.next();
            int type=sc.nextInt();
            int seats = sc.nextInt();
            B[i]=new Bus(name,type,seats);
        } 
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int P=sc.nextInt();
            int K=sc.nextInt();
            int T= sc.nextInt();
                if(P==1){
                    boolean chec1 =false;
                    for(int l=1;l<=Q;l++){
                        if(T==B[l].type){
                            boolean check = B[l].reserve(K);
                            if(check==true){
                                System.out.println(B[l].name);
                                chec1=true;
                                break;
                            }
                        }
                        
                    }
                    if(chec1==false){
                        System.out.println("sorry");
                    }
                 }
                 else if(P==2){
                    B[T].sendToRepair();
                    System.out.println("sorry");
                 }
                 else if(P==3){
                     B[T].backToService();
                     System.out.println(B[T].name);
                 }
            

        }
    }
}