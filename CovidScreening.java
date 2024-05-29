import java.util.Scanner;

public class CovidScreening {
    static void screenCovid(boolean pak,int vio,int age,int vic){
        if(pak==true){
            System.out.println("RT-PCR recommended");
        }
        if(vio==3 || age>=70 ){
            System.out.println("Hospital admission");
        }
        else{
            System.out.println("Home isolation");
        }
        if(vic<2 || vio>=2){ //NO MIDICINE
            System.out.println("Favipiravia included");
        }
        else{
            System.out.println("Standard medicine package");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pakan = sc.nextInt();
        boolean check_pa = false;
        if(pakan==1){
            check_pa = true;
        }
        int vio =sc.nextInt();
        int age = sc.nextInt();
        int vic = sc.nextInt();
        screenCovid(check_pa,vio,age,vic);
    }
}
