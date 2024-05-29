
import java.util.Scanner;
class Visitation {
    int id;
    int date;
    int time[] = new int[100];
    int time_n[] = new int[100];
    int count = 0;
    Visitation(int id,int date){
        this.id = id;
        this.date = date;
    }
    void visit(int time){
        if(time>=0 && time<=23){
            count++;
            for(int i=0;i<24;i++){

            }
            // this.time[count] = time;
        }
        else{
            System.out.println("invalid hour : "+time);
        }
     
    }
    int count(){
        return count;
        
    }
    void printVisitHours(){
        System.out.println(this.id);
        System.out.println(this.date);
        System.out.println(count);
        boolean check=false;  
        for(int i = 1;i<=count;i++){
            int co = count;
            for(int j=1;j<=count;j++){
                if(time[i]<time[j]){ //10<10 10<5  10<9 10<23 10<0
                    co--;  
                }
            }
                time_n[co] = time[i];
        }
        for(int i=1;i<=time_n.length;i++){
            if(time_n[i]==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("no visit");
        }
        else{
         for(int i = 1;i<=count;i++){
             System.out.print(time_n[i]+" ");
        }
        }
    }
}
public class Covid19Wins1 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int id = scan.nextInt();
 int date = scan.nextInt();
 final int K = scan.nextInt();
 Visitation vis = new Visitation(id, date);
    for(int i=0;i<K;i++){
        int time = scan.nextInt();
        vis.visit(time);
    }
    vis.printVisitHours();
 }
}