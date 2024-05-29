import java.util.Scanner;
class FoodOrder {
    public int foodTotal=0;
    public String name;
    public int grandTotal;
    FoodOrder(String name) {
        this.name = name;  
    }
    void addfood(int price){
        int sum=this.foodTotal;
        sum+=price;
        this.foodTotal = sum;
    }
    void finalizeReceipt(){
        System.out.println(name);
        System.out.println(foodTotal);
        if(this.foodTotal<=50){
            this.grandTotal=this.foodTotal+20;
            System.out.println("20");
        }
        else if(50<=this.foodTotal && this.foodTotal<=150){
            this.grandTotal=this.foodTotal+10;
            System.out.println("10");
        }
        else{
            this.grandTotal=this.foodTotal+0;
            System.out.println("0");
        }
        System.out.println(this.grandTotal);
    }
   void distribIncome(){
    if(grandTotal<=200){
        System.out.println("Rider: "+20);

        System.out.println("GrabPanda: "+(foodTotal*3)/10);
        System.out.println("Food Seller: "+(grandTotal-((foodTotal*3)/10)-20));
    }
    else{
        System.out.println("Rider: "+30);
        System.out.println("GrabPanda: "+(foodTotal*3)/10);
        System.out.println("Food Seller: "+(grandTotal-((foodTotal*3)/10)-30));
    }
   }

}


public class GrabPanda1 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    int N = scan.nextInt();
    FoodOrder order =new FoodOrder(name) ;
    for(int i = 0; i < N; ++i) {
        int price = scan.nextInt();
            order.addfood(price);
        }
        order.finalizeReceipt();
        order.distribIncome();
    }
}