import java.util.Scanner;

public class WallMaria_WallRose_WallSina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int size_wall = x+6;
        int wall[][] = new int[size_wall][size_wall];
        for(int r=0;r<size_wall;r++){
            for(int c=0;c<size_wall;c++){
                if(r==2 || c==2 || r==size_wall-3 || c==size_wall-3){
                    wall[r][c]=1;
                }
                if(r==1 || c==1 || r==size_wall-2 || c==size_wall-2){
                    wall[r][c]=2;
                }
                if(r==0 || r==size_wall-1 || c==0 || c==size_wall-1){
                    wall[r][c]=3;
                }
                
            }
        }
        int tra[][]= new int[size_wall][size_wall];
        int c_Suvey = 0;
        int c_Devi = 0;
        int c_Att = 0;
        int c_WAr = 0;
        int c_ARm = 0;
        int c_colo = 0;
        int c_sina =0;
        int c_rose = 0;
        int c_maria = 0;
        int c_royal=0;
        for(;;){
            int R_1 = sc.nextInt();
            int C_1 = sc.nextInt();
            int cat = sc.nextInt();
            if(R_1<0||C_1<0||cat<0 ||R_1>9 || C_1>9 || cat>9){
                break;
            }
            if(cat==4){
                c_Att++;
                tra[R_1][C_1]=4;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            }
            else if(cat==1){
                tra[R_1][C_1]=1;
                c_Devi++;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            }
            else if(cat==6){
                tra[R_1][C_1]=6;
                c_WAr++;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            }
            else if(cat==8){
                tra[R_1][C_1]=8;
                c_ARm++;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            }
            else if(cat==9){
                tra[R_1][C_1]=9;
                c_colo++;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            }
            else{
                tra[R_1][C_1]=cat;
                c_Suvey++;
                if(wall[R_1][C_1]==1){
                    c_sina++;
                }
                else if(wall[R_1][C_1]==2){
                    c_rose++;
                }
                else if(wall[R_1][C_1]==3){
                    c_maria++;
                }
                else if(wall[R_1][C_1]==0){
                    c_royal++;
                }
            } 
        }
        
        // int Ra = sc.nextInt();
        // for(int i=0;i<Ra;i++){
        //     int R_1 = sc.nextInt();
        //     int C_1 =  sc.nextInt();
        //     int dama = sc.nextInt();
        //     if(dama==4 && wall[R_1][C_1]==1){
        //         wall[R_1][C_1]=4;
        //     }
        //     else if(dama==8 && wall[R_1][C_1]==2){
        //         wall[R_1][C_1]=8;
        //     }
        //     else if(dama==9 && wall[R_1][C_1]==3){
        //         wall[R_1][C_1]=9;
        //     }
        //     else{
        //         System.out.println("Attack on Titan");
        //     }
        // }
        System.out.println("WALL MAP ["+size_wall*size_wall+"]");
        for(int r=0;r<size_wall;r++){
            for(int c=0;c<size_wall;c++){
                System.out.print(tra[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("WALL MAP ["+size_wall*size_wall+"]");
        
    }
}
