import java.util.Scanner;

class Party {
    String name;
    Party(String name, int N, int Scanner) {

    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    final int K = scan.nextInt();
    for(int i = 0;i<K;++i)
    {
        int partyNumber = scan.nextInt();
        int regionNumber = scan.nextInt();
        Party[partyNumber].printInfo(regionNumber);
    }
    }
}
