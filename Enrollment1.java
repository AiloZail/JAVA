import java.util.ArrayList;
import java.util.Scanner;
class Student{
    int id;
    String firstname;
    String lastname;
    Student(int id,String firstname,String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname  =lastname;
    }
    void printInfo(){
        System.out.print(firstname+" "+lastname+" ");
    }
}
class Course{
    String sub_n;
    int max_stu;
    ArrayList <Integer> stu_num = new ArrayList<>();
    Course(String sub_n,int max_stu){
        this.sub_n = sub_n;
        this.max_stu = max_stu;
       
    }
    boolean enroll(int id,Student[] s){
        int count =0;
        boolean check =false;
        for(int i=0;i<s.length;i++){
            if(id!=s[i].id){
                check=true;
            }
        }
        if(check==true){
            System.out.println("Invalid ID");
            return false;
        }
        else{
            s[]
        }
        if(stu_num.size()==0){
           stu_num.add(id);
           return true;
        }
        else{
            for(int i=0;i<stu_num.size();i++){
                if(stu_num.get(i)==id || stu_num.size()==max_stu){
                    return false;
                }
                else{
                    continue;
                }
            }
        stu_num.add(id);
          return true;  
        }

       
    }
    void printInfo(){
        System.out.println(sub_n+" "+stu_num.size());
        for(int i=0;i<stu_num.size();i++){
            System.out.println(stu_num.get(i));
        }
    }   
}
public class Enrollment1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int P = scan.nextInt();
    Student[] s = new Student[P];
    for(int i = 0; i < P; ++i) {
    int id = scan.nextInt();
    String firstName = scan.next();
    String lastName = scan.next();
        s[i] = new Student(id, firstName, lastName);
    }
   
    String str = scan.next();
    final int N = scan.nextInt();
    final int K = scan.nextInt();
   
    Course co = new Course(str, N);
    for(int i = 0; i < K; ++i) {
    int id = scan.nextInt();
    boolean result = co.enroll(id, s);
    System.out.println(result);
    }
    co.printInfo();
    }
   }