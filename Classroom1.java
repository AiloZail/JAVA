import java.util.Scanner;

class Classroom {
    String name;
    int numSeats;
    boolean np, nv, ns, nc;
    boolean avai;

    Classroom(String name, int numSeats, boolean np, boolean nv, boolean ns, boolean nc) {
        this.name = name;
        this.numSeats = numSeats;
        this.np = np;
        this.nv = nv;
        this.ns = ns;
        this.nc = nc;
    }

    boolean isAvailable(int numSeats, boolean np, boolean nv, boolean ns, boolean nc) {
        if (np == true) {
            this.np==true;
        }
        if (this.numSeats >= numSeats) {

        }
    }

    boolean reserve(int numSeats, boolean np, boolean nv, boolean ns, boolean nc) {

    }
}

public class Classroom1 {
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int n = scan.nextInt();

 Classroom[] rooms = new Classroom[n];
 for(int i=0;i<n;i++) {
 String name = scan.next();
 int numSeats = scan.nextInt();
 int nProj = scan.nextInt();
 int nVisual = scan.nextInt();
 int nSmart = scan.nextInt();
 int nCam = scan.nextInt();
 boolean nP,nV,nS,nC;
 if(nProj==1){
    nP=true;
 }
 if(nVisual==1){
    nV=true;
 }
 if(nSmart==1){
    nS=true;
 }
 if(nCam==1){
    nC=true;
 }
   rooms[i] = new Classroom(name, numSeats,nP,nV,nS,nC);
 }

 int k = scan.nextInt();
 for(int i=0;i<k;i++) {
 int numSeats = scan.nextInt();
 int nProj = scan.nextInt();
 int nVisual = scan.nextInt();
 int nSmart = scan.nextInt();
 int nCam = scan.nextInt();

 for(?????) {
 ?????
 }
 if(?????
)
 ?????

}

}
}