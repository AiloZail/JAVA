import java.util.Scanner;

class SlaagOffice {
    int[] nums;

    SlaagOffice(int first, int[] sec) {
        nums = new int[4];
        nums[0] = first;
        nums[1] = sec[0];
        nums[2] = sec[1];
    }

    void checkPrize(Lottery Lotte) {

        if (nums[0] == Lotte.num[0]) {
            Lotte.oneFront = true;
        }
        if (nums[0] == Lotte.num[3]) {
            Lotte.oneBack = true;
        }
        if (nums[1] == Lotte.num[2] && nums[2] == Lotte.num[3]) {
            Lotte.twoBack = true;
        }
        if (nums[1] == Lotte.num[0] && nums[2] == Lotte.num[1]) {
            Lotte.twoBack = true;
        }

    }
}

class SlaagOffice2 extends SlaagOffice {
    int ar2d[][];
    int L_c;
    SlaagOffice2(int first, int[] sec,int[][] c_num){
        super(first, sec);  
        ar2d = c_num;
        L_c = c_num.length;
    }
    void checkPrize(Lottery L){
        boolean check=false;
        for(int i=0;i<L_c;i++){
            if(L.num[0]==ar2d[i][0] && L.num[1]==ar2d[i][1] && L.num[2]==ar2d[i][2] && L.num[3] == ar2d[i][3]){
                check = true;
                System.out.println("You got exact-match prize");
                break;
            }
        }
       
        if(check==false){
            System.out.println("No exact-match prize");
           }
       super.checkPrize(L);
    }
}

class Lottery {
    boolean oneFront;
    boolean oneBack;
    boolean twoFront;
    boolean twoBack;
    int[] num;

    Lottery(int[] num) {
        this.num = num;
        oneFront = false;
        oneBack = false;
        twoBack = false;
        twoFront = false;
    }

    void reportPrize() {
        if (oneFront == true) {
            System.out.println("You got one front prize");
        }
        if (oneBack == true) {
            System.out.println("You got one back prize");
        }
        if (twoFront == true) {
            System.out.println("You got two front prize");
        }
        if (twoBack == true) {
            System.out.println("You got two back prize");
        }
        if (oneBack == false && oneFront == false && twoBack == false && twoFront == false) {
            System.out.println("Sorry, no prize");
        }

    }
}

public class Kongslaag2 {

public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int a = scan.nextInt();
 // Create a 2-number array from user inputs.
 int[] b = {scan.nextInt(), scan.nextInt()};
 final int R = scan.nextInt();
 int[][] exactPrizes = new int[R][];
 for(int i = 0; i < R; ++i) {
 int[] temp = {scan.nextInt(), scan.nextInt(),scan.nextInt(), scan.nextInt()};
 exactPrizes[i] = temp;
 }
 SlaagOffice2 office = new SlaagOffice2(a, b,exactPrizes);

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            // Create a 4-number array from user inputs.
            int[] nums = { scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt() };
            Lottery lotto = new Lottery(nums);
            office.checkPrize(lotto);
            
            lotto.reportPrize();
            
        }
    }
}
