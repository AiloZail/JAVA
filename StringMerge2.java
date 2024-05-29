import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int l_str1 = str1.length();
        int l_str2 = str2.length();
        int l_str_min;
        if(l_str1>l_str2){
           l_str_min=l_str2; 
        }
        else{
            l_str_min= l_str1;
        }
        for(int i=0;i<l_str_min;i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if(c1>='A' && c1<='Z'){
                if(c2>='a' && c2<='z'){
                    System.out.print(c1);
                }
                else if(c2>='A' && c2<='Z'){
                    System.out.print(c1);
                }
                else if(c2>='0' && c2<='9'){
                    System.out.print(c2);
                }
                else if(c2=='{' || c2=='}'){
                    System.out.print(c2);
                }
                else if(c2=='(' || c2==')'){
                    System.out.print(c2);
                }
            }
            else if(c1>='a' && c1<='z'){
                if(c2>='A' && c2<='Z'){
                    System.out.print(c2);
                }
                else if(c2>='a' && c2<='z'){
                    System.out.print(c1);
                }
                else if(c2>='0' && c2<='9'){
                    System.out.print(c2);
                }
                else if(c2=='}' || c2=='{' || c2=='(' || c2==')'){
                    System.out.print(c2);
                }
            }
            else if(c1>='0' && c1<='9'){
                if(c2==')'|| c2=='('){
                    System.out.print(c2);
                }
                else if(c2>='a' && c2<='z'){
                    System.out.print(c1);
                }
                else{
                   System.out.print(c1); 
                }
            }
            else if(c1=='(' || c1==')'){
                if(c2=='{' || c2=='}'){
                    System.out.print(c2);
                }
                else{
                    System.out.print(c1);
                }
            }
            else if(c1=='{' || c1=='}'){
                System.out.print(c1);
            }   
        }
    }
}
