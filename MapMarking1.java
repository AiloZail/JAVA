import java.util.Scanner;


public class MapMarking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Mark_R = sc.nextInt();
        int Mark_C = sc.nextInt();
        int N = sc.nextInt();
        
        int num[][] = new int[R+1][C+1];
        for(int i=0;i<N;i++){
            int control = sc.nextInt();
            if(control==1){ //left
                Mark_C--;
            }
            else if(control==2){//right
                Mark_C++;
            }
            else if(control==3){//top
                Mark_R--;
            }
            else if(control==4){//down
                Mark_R++;
            }
             System.out.print(Mark_R+" "+Mark_C+" ");
             System.out.print("\n");
             for(int r=0;r<=R;r++){
                for(int c=0;c<=C;c++){
                
                 num[Mark_R][Mark_C]=1;
                 System.out.print(num[r][c]+" ");
                }
                System.out.println();
            }
        }
        // for(int r=1;r<=R;r++){
        //         for(int c=1;c<=C;c++){
        //          System.out.print(num[r][c]+" ");
        //         }
        //         System.out.println();
        //     }
        
       
    }
}
