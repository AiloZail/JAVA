import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        for(int i=1;i<=R;i++){
            for(int j=1;j<=C;j++){
                System.out.print((i+","+j+" "));
            }
            System.out.println();
        }
        int check1=0;
        int check2=0;
        for(int i=0;i<K;i++){
            int shot_x=sc.nextInt();
            int shot_y=sc.nextInt(); //
            if(shot_x>=0 && shot_x<R){

            }   
           
            System.out.println(check1+"\n"+check2);
           }
           //System.out.println(check1+"\n"+check2);
        }
        //System.out.println(check1+"\n"+check2);
        
}

