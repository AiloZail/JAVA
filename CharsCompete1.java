import java.util.Scanner;

public class CharsCompete1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String tar1 = sc.next();
        String tar2 = sc.next();
        int target = sc.nextInt();
        int c_tra1 = 0;
        int c_tra2 = 0;
        int out2 = 0;
        int out1= 0;
        for(int i=0;i<str.length();i++){
         int c1 =  str.indexOf(tar1,out1);
            if(c1>-1){
                c_tra1++;
                out1=c1+1;
            }
            if(c_tra1==target){
                System.out.println(tar1);
                System.out.println(c_tra1+" "+c_tra1);
                break;
            }
            int c2 =str.indexOf(tar2, out2);
            if(c2>-1){
                c_tra2++;
                out2=c2+1;
            }
            if(c_tra2==target){
                System.out.println(tar2);
                System.out.println(c_tra2+" "+c_tra2);
                break;
            }
        
       
        // for(int i=0;i<str.length();i++){
        //     int out = 0;
        //     int c = str.indexOf(tar2,out);
        //     if(c==-1){
        //         break;
        //     }
        //     else{
        //         out+=c;
        //         c_tra2++;
        //     }
        // }
        }
    }
}
