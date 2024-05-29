import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int god = str.indexOf("GOD");
        int L_god = str.lastIndexOf("GOD");
        int ppap = str.indexOf("PPAP");
        int L_ppap = str.lastIndexOf("PPAP");
        // System.out.println(god+" "+L_god);
        // System.out.println(ppap+" "+L_ppap);
        if(ppap==-1 && L_ppap==-1){
            System.out.println("clean");
        }
        else if(god<ppap && L_god>L_ppap){
            System.out.println("safe");
        }
        else if(god>ppap && L_god>L_ppap){
            System.out.println("danger");
        }
        else if(god<ppap && L_god<L_ppap){
            System.out.println("danger");
        }
        else{
            System.out.println("danger");
        }

    }
}//GRREPPAPDDOPQXYETATJFKHJYVZKQDOOSFUXQJJNNDSRBSQYMXKVGODBBCUIPAHWBBPDQEQSNFZUODHEGODAQLGODUKGOTXTOIXCEPNNGODQBNAKANVEGJPFXNEEJWVYQXXLOZXXUPBRFEWZMPPAPYKPIGODWCCHFJNLNVGEXHNNFSNUTQPPAPQXXPPAPGNGRPWFBDRPYSBVDLBPPAPGODWVUPENECPQEFPWYIXSUNWUDTTQRTVCLZRIQLMRMWBZPYDNOWBOCNGVAVVSQRIGCBNLSLJUGVDFJWRRAYLQIGODGODQIFJHFYWKTQMTPPAPKFNJYDEOJVLPZXUTOFPPAPQTQLZXLMHSMAPGOLX
