import java.util.Scanner;

class Product {
    String name;
    String sku;
    double price;
    int weight;
    boolean valid = true;

    Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        boolean check = false;
        if (name.length() <= 0 || name==null) {
            System.out.println("name is invalid");
            check = true;
        }
        if (sku.length() <= 0 || sku==null ) {
            System.out.println("sku is invalid");
            check = true;
        }
        if (price < 0) {
            System.out.println("price is invalid");
            check = true;
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            check = true;
        }
        if (check == true) {
            valid = false;
            return false;

        } else {
            return true;
        }
    }

    void printInfo() {
        System.out.print(name + ", " + sku + ", " + price + ", " + weight + ", ");
        if (valid == false) {
            System.out.println("Invalid");
        } else {
            System.out.println("valid");
        }
    }
}

public class ProductStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Product P[] = new Product[N+1];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            P[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            P[i].checkValidity();
            System.out.println(P[i].valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            P[i].printInfo();
        }
    }
}