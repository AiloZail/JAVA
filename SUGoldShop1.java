import java.util.Scanner;

class Item{
    
    Item(boolean check,int weight){

    }
}
public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i=0;i<n;i++){
        String cmdline = input.next();
        String attgold = input.next();
        double weight = input.nextDouble();
        if (attgold.equalsIgnoreCase("t")) // t
        arrayx[i] = new Item(true,weight);
        else //f
        arrayx[i] = new Item(false,weight);
        arrayx[i].showdetail(pricegold);
        if(cmdline.equalsIgnoreCase("s")){
        System.out.println(" sale "+arrayx[i].saleprice(pricegold));
        }else if(cmdline.equalsIgnoreCase("b")){
        System.out.println(" buy "+arrayx[i].buyprice(pricegold));
        }
        }
        }
       }
