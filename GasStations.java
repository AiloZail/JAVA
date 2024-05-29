import java.util.Scanner;
class GasStation {
    GasStation(boolean[] ){

    }
 private String[] names = {"Dummy", "95S", "91S", "E20",
 "E85", "B7", "B20"};
}
public class GasStations {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 final int N = scan.nextInt();
 GasStation []stations = new GasStation[N+1];
 for(int s = 1; s <= N; ++s) {
 ???[] gas = new ???[7]; //gas with service
 ???[] capa = new ???[7]; //capacity for each gas type
 for(int g = 1; g <= 6; ++g) {
 int k = scan.nextInt();
 gas[g] = (k > 0)? true: false;
 capa[g] = k;
 }
 ??? = new ???(gas, capa);
 }

 final int Q = scan.nextInt();
 for(int i = 0; i < Q; ++i) {
 final int A = scan.nextInt();
 final int S = scan.nextInt();
 final int B = scan.nextInt();
 final int C = scan.nextInt();
 ???;
    }
    }
}