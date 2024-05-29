import java.util.ArrayList;
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
        if (name.length() <= 0 || name == null) {
            System.out.println("name is invalid");
            check = true;
        }
        if (sku.length() <= 0 || sku == null) {
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

class Shoe {
    int gender;
    int size, cat;
    String brand;

    Shoe(Product P, int gender, int size, int cat, String brand) {
        this.gender = gender;
        this.size = size;
        this.cat = cat;
        this.brand = brand;
    }

    void printInfo() {
        if(gender==1){
            System.out.print("female, ");
        }
        else if(gender==2){
            System.out.print("male, ");
        }
        System.out.print(size + ", ");
        if (cat == 1) {
            System.out.print("sport, ");
        } else if (cat == 2) {
            System.out.print("formal, ");
        } else if (cat == 3) {
            System.out.print("casual, ");
        }
        System.out.println(brand);
    }
}

public class ProductStore2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Product> P = new ArrayList<>();
        ArrayList<Shoe> S = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            Product p = new Product(name, sku, prices, weight);
            Shoe s = new Shoe(p, gender, size, type, brand);
            S.add(s);
            P.add(p);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            P.get(i).checkValidity();
            System.out.println(P.get(i).valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
          P.get(i).printInfo();
          S.get(i).printInfo();
        }
    }
}