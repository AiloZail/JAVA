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

public class TestStudent1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Student[] roster = new Student[N];
        for (int i = 0; i < N; i++) {
            String fname = scan.next();
            String lname = scan.next();
            roster[i] = new Student(fname, lname);
            for (int j = 1; j <= 4; j++) {
                int score = scan.nextInt();
                roster[i].setTestScore(j, score);
            }
            roster[i].printInfo();
        }
        int K = scan.nextInt();
        for (int i = 0; i < K; i++) {
            int rosterNum = scan.nextInt();
            int testNum = scan.nextInt();
            System.out.println(roster[rosterNum - 1].getTestScore(testNum));
        }
    }
}
