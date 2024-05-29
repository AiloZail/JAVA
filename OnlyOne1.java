import java.util.Scanner;

public class OnlyOne1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R =sc.nextInt();
        int C  =sc.nextInt();
        int num[][] = new int[R+1][C+1];
        for(int r=1;r<=R;r++){
            for(int c=1;c<=C;c++){
                num[r][c]=sc.nextInt();
            }
        }
        int count_R1 = 0;
        int count_R2 = 0;
        int max_R = 0;
        for(int r=1;r<=R;r++){
            for(int c=1;c<=C;c++){
                if(num[r][c]==1){
                    count_R1++;       
                }
            }
            if(count_R1>=count_R2){
                max_R =r-1;
            }
            count_R1=0;
        }
        int count_C1 = 0;
        int count_C2 = 0;
        int max_C = 0;
        for(int c=1;c<=C;c++){
            for(int r=1;r<=R;r++){
                if(num[r][c]==1){
                    count_C1++;
                }
            }
            if(count_C1>=count_C2){
                max_C=c-1;
            }
            count_C1=0;
        }
       System.out.println(max_R);
       System.out.println(max_C);


    }
}
