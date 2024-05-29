import java.util.ArrayList;
import java.util.Scanner;

class FruitSection {
    int P;
    int W;
    int income = 0; 
    ArrayList<Basket> arr_b = new ArrayList<Basket>();

    FruitSection(int P, int W) {
        this.P = P;
        this.W = W;
    }

    boolean check(Basket B) {
        boolean chk1 = B.price >= 500 && B.price <= P;
        boolean chk2 = B.weight >= 2000 && B.weight <= W * 1000;
        boolean chk3 = B.type >= 3;

        if (chk1 && chk2 && chk3) {
            return true;
        } else {
            return false;
        }
    }

    public void addBasket(Basket B) {
        if (check(B)) {
            arr_b.add(B);
        }
    }

    public void printBasket(int n) {
        if (n >= 0 && n < arr_b.size()) {
            Basket basket = arr_b.get(n);
            System.out.print(basket.grape + " " + basket.melon + " " + basket.apple + " "
                    + basket.cherry + " " + basket.pear + " " + basket.kiwi + ", ");
            System.out.println(basket.price + " " + basket.weight + " " + basket.type);
        }
        else{
            System.out.println("invalid");
        }
    }

    public void sellBasket(int n){
        if (n >= 0 && n < arr_b.size()) {
            System.out.println("sell basket "+(n+1)+" "+ arr_b.get(n).price);
            income+= arr_b.get(n).price;
            arr_b.remove(n);
        }
        else{
            System.out.println("invalid");
        }
    }

    public void printAvailable(){
        if(arr_b.size()<=0){
            System.out.println("nothing to sell");
            return;
        } 
        for (Basket basket : arr_b) {
            System.out.print(basket.grape + " " + basket.melon + " " + basket.apple + " "
                    + basket.cherry + " " + basket.pear + " " + basket.kiwi + ", ");
            System.out.println(basket.price + " " + basket.weight + " " + basket.type);
        }
    }
}

class Basket {

    // ????
    int grape = 0;
    int melon = 0;
    int apple = 0;
    int cherry = 0;
    int pear = 0;
    int kiwi = 0;
    int price;
    int weight;
    int type;

    Basket(int grape, int melon, int apple, int cherry, int pear, int kiwi) {
        this.grape = grape;
        this.melon = melon;
        this.apple = apple;
        this.cherry = cherry;
        this.pear = pear;
        this.kiwi = kiwi;
        price = grape * 120 + melon * 200 + apple * 90 + cherry * 180 + pear * 60 + kiwi * 150;
        weight = grape * 500 + melon * 2000 + apple * 300 + cherry * 350 + pear * 400 + kiwi * 500;
        type = positiveToOne(grape) + positiveToOne(melon) + positiveToOne(apple) +
                positiveToOne(cherry) + positiveToOne(pear) + positiveToOne(kiwi);

    }

    static int positiveToOne(int in) {
        return in > 0 ? 1 : 0;
    }
}

/**
 * Supermarket
 */
public class Supermarket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int W = sc.nextInt();
        FruitSection fs = new FruitSection(P, W);
        while (true) {
            int grape = sc.nextInt();
            int melon = sc.nextInt();
            int apple = sc.nextInt();
            int cherry = sc.nextInt();
            int pear = sc.nextInt();
            int kiwi = sc.nextInt();

            Basket b = new Basket(grape, melon, apple, cherry, pear, kiwi);
            if(b.type==0){
                break;
            }
            else{
                fs.addBasket(b);
            }
        }

        String command = "";
        while (true) {
            command = sc.next();
            if(command.equals("stop")) {
                System.out.println("income: "+ fs.income);
                break;
            }
            else if(command.equals("sell")){
                int n = sc.nextInt()-1;
                fs.sellBasket(n);
            }
            else if(command.equals("print")){
                int n = sc.nextInt()-1;
                fs.printBasket(n);
            }
            else if(command.equals("printAll")){
                fs.printAvailable();
            }
        } 
        

    }
}