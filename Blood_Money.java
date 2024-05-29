import java.util.Scanner;

public class Blood_Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            String str = sc.next();
           String str1 = "";
            for(int l=0;l<str.length();l++){
                char A = str.charAt(l);
                if(l==0){
                    str1=str1+A;
                }
                if(A=='#'){
                    char B = str.charAt(l+1);
                    str1 = str1+B;
                }
                if(A=='@'){
                    str1 = str1+' ';
                    str1 = str1+str.charAt(l+1);
                }
                if(A=='$'){
                    str1 = str1+" [Blood Money $";
                    str1 =str1+str.substring(l+1);
                    str1 = str1+"]";
                }
            }
            System.out.println(str1);
        }
    }

}
