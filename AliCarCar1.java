import java.util.Scanner;

class Car {
    String name;
    int price;
    int power;
    int id;
    Car(int id,String name, int price, int power) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.power = power;
    }

    static boolean check(String name, int price, int labor) {
        if (name.length() > 0 && price > 0 && labor > 0) {
            return true;

        } else {
            return false;
        }
    }
}

class Factory {
    
    Factory(){
        
    }
}

public class AliCarCar1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N + 1];
        boolean check;
        int id = 0;
        int sum = 0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            check = Car.check(name, price, labor);
            if (check == true) {
                // System.out.println("valid");
                cars[id] = new Car(id,name, price, labor);
                id++;
                sum +=labor;
            } else {
                // System.out.println("invalid");
            }
        }

        for (int i = 0 ; i < id; i++){
            System.out.println(i+1 + " " + cars[i].name);
           
        }
    }
}
/*7
Swift 50 200
Ciaz 65 0
Yaris -1 180
Vios 0 260
Tiana 80 290
Sunny 80 -5
Leopard 200 350 */