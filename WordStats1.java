import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int c[] = new int[26];
        for(int i=0;i<N;i++){
            String str = sc.next();
            char x = str.charAt(0);
            for(char L='A';L<='Z';L++){
                if(x==L){
                    c[x]++;
                }
            }
        }
        for(int i='A';i<='Z';i++){
            if(c[i]>=0){
                System.out.println((char)i +" "+ c[i]);
            }
        }
    }
}
