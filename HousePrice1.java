import java.util.Scanner;

class House {
    int landSize,quality,floors,houseArea;
    public int price=0;
    House(int landSize,int quality,int floors,int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this. floors = floors;
        this.houseArea = houseArea;
        this.price = this.computePrice(landSize, quality, floors, houseArea);
    }
    int computePrice(int landSize,int quality,int floors,int houseArea){
        int price = 0;
        price = 10000*landSize;
        if(floors>1){
        price += 200000*(floors-1);
        }
        if(quality==1){
            price +=10000*houseArea;
        }
        else if(quality==2){
            price += 8000*houseArea;
        }
        else if(quality==3){
            price +=5000*houseArea;
        }
        return price;
    }
}

public class HousePrice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        House H[] =  new House[N];
        for(int i =0;i<N;i++){
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            H[i] = new House(landSize, quality, floors, houseArea);
        }
        int max_price = scan.nextInt();
        int min_housA = scan.nextInt();
        boolean check =false;
        for(int i=0;i<N;i++){
            if(max_price>=H[i].price && H[i].houseArea >= min_housA){
                System.out.println(H[i].landSize + " " + H[i].quality + " " + H[i].floors + " " + H[i].houseArea+" "+H[i].price);
               
                check=true;
            }
        }
        if(check==false){
            System.out.println("none");
        }
       
       
    }
}