import java.util.Scanner;

class Student {
    final static int NUM_TEST = 4;
    String first, last;
    private int step[];

    Student(String first, String last) {
        this.first = first;
        this.last = last;
        step = new int[4];
    }

    int getTestScore(int N) {
        return step[N - 1];
    }

    void setTestScore(int N, int set) {
        step[N - 1] = set;
    }

    int computeTotal() {
        return step[0] + step[1] + step[2] + step[3];
    }

    void printInfo() {
        System.out.println(first + " " + last + " " + computeTotal());
    }
}

class Undergraduate extends Student {
    public int id;
    private String stepLevel;
    private boolean engPass;

    Undergraduate(int id, String name, String last) {
        super(name, last);
        this.id = id;
        engPass = false;
    }

    String computeLevel() {
        if (computeTotal() >= 1 && computeTotal() <= 25) {
            stepLevel = "A1";
        } else if (computeTotal() >= 26 && computeTotal() <= 50) {
            stepLevel = "A2";
        } else if (computeTotal() >= 51 && computeTotal() <= 75) {
            stepLevel = "B1";
        } else if (computeTotal() >= 76 && computeTotal() <= 100) {
            stepLevel = "B2";
        } else if (computeTotal() >= 101 && computeTotal() <= 120) {
            stepLevel = "C1";
        } else {// out of range 1-120
            for (int i = 0; i < 4; i++) { // set all score to 0
                setTestScore(i, 0);
            }
            stepLevel = "NA";
        }
        return stepLevel;
    }

    @Override
    void printInfo() {
        System.out.print(id + " ");
        super.printInfo();
        if (computeTotal() >= 1 && computeTotal() <= 75) {
            System.out.print("Not pass ");
        } else if (computeTotal() >= 75 && computeTotal() <= 120) {
            System.out.print("Pass ");
        } else {
            System.out.print("Invalid score ");
        }
        System.out.println(computeLevel());
    }
}

public class TestUndergraduate {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Undergraduate[] roster = new Undergraduate[N];
        for (int i = 0; i < N; i++) {
            int id = scan.nextInt();
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Undergraduate(id, fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score);
            }
        }
        boolean found = false;
        int rosterId = scan.nextInt();
        for (int i = 0; i < N; i++) {
            if (roster[i].id == rosterId) {
                roster[i].printInfo();
                for (int j = 1; j <= 4; j++) {
                    System.out.print(roster[i].getTestScore(j - 1) + " ");
                }
                found = true;
            }
        }
        if(found=false){
            System.out.println("Not found");
        }
    }
}