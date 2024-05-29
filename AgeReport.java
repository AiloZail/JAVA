import java.util.Scanner;

public class AgeReport {
    
    static int  reportage(String[] ID,int[] age,int min,int max,int N){
        int count = 0;
        for(int i=1;i<=N;i++){
            if(age[i]>=min && age[i]<=max){
              
                count++;
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String[] ID = new String[N+1];
        int[] age = new int[N+1];
        for(int i=1;i<=N;i++){
            ID[i] = sc.next();
            age[i] = sc.nextInt();
        }
        int min_age = sc.nextInt();
        int max_age = sc.nextInt();
        int count =reportage(ID,age,min_age,max_age,N);
        
        System.out.println(count);
    }   
}
