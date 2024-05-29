import java.util.Scanner;

public class SUpiercer0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        boolean Check = false;
        int[] x = new int[10];
        for(int i=0;i<N;i++){
             int IN = s.nextInt();
            IN=IN/100;
            IN=IN%10;
            if(IN==0){
               System.out.println("Wilkorn Only");
            }
            else if(IN>4){
                System.out.println("No Permission");
            }
            // System.out.println(IN);
            for(int j=1;j<10;j++){
                 if(IN==j)
                    x[j]++;
            }
            for(int j=5;j<10;j++){
                 if(x[j]>=1){
                    Check = true;
                    break;
                 }
            }

        }
        System.out.println("First Class "+ x[1]);
         System.out.println("Second Class "+ x[2]);
          System.out.println("Third Class "+ x[3]);
           System.out.println("The Tail "+ x[4]);
        if(Check==true){
            System.out.println("###########");
            System.out.println("Fake Tickets");
        }
        for(int i=5;i<10;i++){
                if(x[i]>=1){
                    System.out.println("Class "+i+" "+x[i]);
                }
            }

    }
}
