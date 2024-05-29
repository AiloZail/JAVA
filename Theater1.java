import java.util.Scanner;

class Theater {
    public int N;
    public boolean[] seats;
    public boolean D3, lux;
    public String title;
    public int basePrice;

    Theater(boolean D3, boolean lux, int seat) {
        this.N = seat;
        this.lux = lux;
        this.D3 = D3;
        this.seats = new boolean[N + 1];

    }

    int reserveOne(int seatNumber) {
        if (seats[seatNumber] == false && seatNumber > 0 && seatNumber < seats.length) {
            seats[seatNumber] = true;
            return this.basePrice * 100;
        } else {
            System.out.println("sorry");
            return -1;
        }
    }

    int reserveMultiple(int numSeats, int seatNumber) {
        int ad=seatNumber;
        int so=0;;
       for(int i=0;i<seatNumber;i++){
        if(i==1){
            ad=ad+0;
        }
        else{
           ad=ad+1;
        }
        if(seats[ad]==false && ad<seats.length && ad>0){
            so++;
        }
        else{
            break;
        }
       }
       if(so==numSeats){
        for(int i=0;i<seatNumber;i++){
            if(){
                
            }
        }
       }
        
    }

    void setTitle(String AV) {
        if (AV == null || AV == "" || AV == "-1" || AV.length() == 0) {
            this.title = "";
            System.out.println("invalid title");

        } else {
            this.title = AV;
        }
    }

    void setBasePrice(int price) {
        if (price <= 0) {
            System.out.println("invalid price");
        } else {
            this.basePrice = price;
        }
    }

    void printInfo() {
        if (this.D3 == true) {
            System.out.println("3D");
        } else {
            System.out.println("No 3D");
        }
        if (this.lux == true) {
            System.out.println("Luxury");
        } else {
            System.out.println("Standard");
        }
        System.out.println(this.seats.length - 1);
        if (this.title.length() == 0) {
            System.out.println("title is not set");
        } else {
            System.out.println(this.title);
        }
        if (basePrice == 0) {
            System.out.println("price is not set"); // 2 5 2 9
        } else {
            System.out.println(this.basePrice);
        }
    }
}

public class Theater1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1)
            threeD = true;
        if (luxury1 == 1)
            luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);
        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int numberOfSeats = scan.nextInt();
            int seatNumber = scan.nextInt();
            int totalPrice;
            if (numberOfSeats == 1)
                totalPrice = t.reserveOne(seatNumber);
            else
                totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
            if (totalPrice > 0)
                System.out.println(totalPrice);
        }
        t.printInfo();
    }
}
