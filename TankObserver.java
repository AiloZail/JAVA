import java.util.Scanner;
class WaterTank{
    int capacity;
    int volume=0;
   public WaterTank(int W,int L,int H){
        this.capacity = W*L*H; 
    }
    int fill(int f){
        this.volume=volume+f;
        if(capacity-volume<0){
            this.volume=volume-f;
            System.out.println("Cannot fill the tank");
            return -1;
        }
        else{
            return volume;
        }
    }
}


public class TankObserver {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int width = scan.nextInt();
    int length = scan.nextInt();
    int height = scan.nextInt();
    WaterTank tank = new WaterTank(width, length, height);
    for(int i = 0; i < 5; ++i) {
    int amount = scan.nextInt();
        System.out.println(tank.fill(amount));
    }
    }
   }
