import java.util.Scanner;


public class AQIMeaning {
    static void  level_of_Concern(int A){
        if(A>=0 && A<=50){
            System.out.println("Good");
        }
        else if(A>=51 && A<=100){
             System.out.println("Moderate");
        }
        else if(A>=101 && A<=150){
            System.out.println("Unhealthy for Sensitive Groups");
        }
        else if(A>=151 && A<=200){
            System.out.println("Unhealthy");
        }
        else if(A>=201 && A<=300){
            System.out.println("Very Unhealthy");
        }
        else{
            System.out.println("Hazardous");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int AQI = sc.nextInt();
        level_of_Concern(AQI);
    }
}
