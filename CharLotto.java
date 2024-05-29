import java.util.Scanner;

public class CharLotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[20];
        String str1[] = new String[10];
        int score[] = new int[10];
        for(int i=0;i<12;i++){
            str[i] = sc.next();
           
        }
        for(int i=0;i<6;i++){
            str1[i]=sc.next();
        }
        for(int i=0;i<12;i++){
            for(int l=0;l<6;l++){
                if(str[i].equals(str1[l])){
                    score[l]++;
                }
            }
        }
        int sum=0;
        for(int i=0;i<6;i++){
            System.out.print(score[i]+" ");
            sum+=score[i];
        }
        System.out.println();
        System.out.println(sum);

         // if(str.equals("AK")){
            //     c_AK++;
            // }
            // else if(str.equals("KA")){
            //     c_KA++;
            // }
            // else if (str.equals("PK")){
            //     c_PK++;
            //     c_PK_1++;
            // }
            // else if(str.equals("ZE")){
            //     c_ZE++;
            // }
            // else if(str.equals("WH")){
            //     c_WH++;
            // }
        // System.out.println(c_AK+" "+c_KA+" "+c_PK+" "+c_PK_1+" "+c_ZE+" "+c_WH);
        // System.out.println(c_AK+c_KA+c_PK+c_PK_1+c_WH+c_ZE);
    }   
}
