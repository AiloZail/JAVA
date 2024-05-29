import java.util.Scanner;

class LectRoom{
    public int classCode,capacity;
    public String name;
    public int  currentSeats=0;
    LectRoom(int classCode,String name,int capacity){
        this.name = name;
        this.classCode = classCode;
        this.capacity = capacity;
    }
    boolean reserveSeats(int currentSeats){
        this.currentSeats=this.currentSeats+currentSeats;
        if(capacity<currentSeats || capacity<this.currentSeats){
            this.currentSeats=this.currentSeats-currentSeats;
            return false;
        }
        else{
            return true;
        }
    }
}
public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        LectRoom[] l = new LectRoom[K];
        for(int i=0;i<K;i++){
            int classCode = sc.nextInt();
            String name = sc.next();
            int capacity  = sc.nextInt();
            l[i] = new LectRoom(classCode, name, capacity);
        }
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int cla=sc.nextInt();
            int cap=sc.nextInt();
            boolean print = false;
            for(int e=0;e<K;e++){
                LectRoom lr  = l[e];
                if(lr.classCode != cla){
                    continue;
                }
                boolean com = lr.reserveSeats(cap);
                if(com ==true){
                    System.out.println(lr.name);
                    print=true;
                    break;
                }
            }
            if(print==false){
                System.out.println("sorry");
            }
           
        }
    }
}
