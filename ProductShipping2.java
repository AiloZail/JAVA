import java.util.Scanner;

class Product {
    String name;
    int weight, price;
    int sum_we  =0;
    int sum_pri =0;
    Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.sum_we=this.sum_we+weight;
        this.sum_pri+=price;
    }

    void printInfo() {
        System.out.println(weight + " grams of " + name + " costs " + price + " bath.");
    }
}

class PurchaseOrder {
    int n;
    int amount[];
    int products[];

    PurchaseOrder(int n,int[] products,int[] amount) {
            
    }
    void printInfo(){

    }
}

public class ProductShipping2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        po.printInfo();
    }
}