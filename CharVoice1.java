import java.util.Scanner;

class Character {
    String  msg[];  
    Character(String msg[]){
        int L = msg.length;
        java.util.Arrays.c
        
        }
        this.msg = java.util.Arrays.copyOf(msg,L);
    }
    void speak() {
        for(int i=0;i<msg.length;i++){
            System.out.println(this.msg[i]);
        }
    }
}

public class CharVoice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C =scan.nextInt();
        final int N = scan.nextInt();
        Character [] c1 = new Character[C];
        String[] msg = new String[N];
        scan.nextLine(); // Skip end-line char
       for(int i=0;i<C;i++){
            for (int l = 0; l < N; ++l) {
                msg[l] = scan.nextLine();
            }
            c1[i] = new Character(msg);
       int a = (Math.PI*(2*2));
       int b = sqrt(121);
       }
        // int count = 1;
        int k = scan.nextInt();
        for(int i=0;i<k;i++){
            int x = scan.nextInt();
            c1[x-1].speak();
            // if(i<N){
            //     c1[i].speak();
            //     count++;
            //      i++;
            // }
            // if(i==N){
            //     i=0;
            // }
            // if(count==k+1){
            //     break;
            // }
        }
    }
}