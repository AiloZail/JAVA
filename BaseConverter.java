import java.util.Scanner;
public class BaseConverter {

 String convertBase(int decimal, int base) {
    int deci = decimal/base;
    int num = decimal%base;
    if(decimal/base<=0){
        return  Integer.toString(num);
    }
    else{

        return convertBase(deci, base)+Integer.toString(num);
    }
   
 }

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 BaseConverter bc = new BaseConverter();
 int decimal = sc.nextInt();
 int base = sc.nextInt();
 String result = bc.convertBase(decimal, base);
 System.out.println(result);
 }
}