import java.util.Scanner; 

class GameCharacter{
  String name;
  int attack,defense;
  int level=0;
  GameCharacter(String name){
    this.name = name;
  }
  
  void stat(){
    System.out.print(name+" ");
    System.out.print(level+" ");
    System.out.print(attack+" ");
    System.out.println(defense);
  }
}
class Hero extends GameCharacter{
    Hero(String name){ 
        super(name);
         attack = 10;
         defense = 5;
         level = 1;
    }
    void hit(Monster x){
        int up = x.score/100;
        if(up!=0){
           attack=attack+(up*3);
           defense= defense+(up*2);
           level+=up;
        }
    }
}
class Monster extends GameCharacter{
    int score;
    Monster(String name, int level, int score){
        super(name);
       this.score = score;
       attack = 2*level;
       defense = 3*level;
    }
}
public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        Hero[] heroes = new Hero[M];
        for(int i=0;i<M;i++){
          String name = scan.next();
          heroes[i] = new Hero(name);
        }
        int N = scan.nextInt();
        Monster[] monster = new Monster[N];
        boolean[] alive = new boolean[N];
        for(int i=0;i<N;i++){
          int level = scan.nextInt();
          int score = scan.nextInt();
          monster[i] = new Monster(Integer.toString(i+1),level ,score);
        }
        int K = scan.nextInt(); //รับจำนวนคำสั่ง
        for(int i=0;i<K;i++){ //วนรับคำสั่งเพื่อดำเนินการ
          int iHero = scan.nextInt()-1;
          int iMonster = scan.nextInt()-1;
          if (!alive[iMonster]){
            heroes[iHero].hit(monster[iMonster]); //ฮีโรตัวที่ iHero ตี สัตว์ประหลาดตัวที่ iMonster รู้มาจากคำสั่ง
            alive[iMonster] = !alive[iMonster];
          }
        }
        for(int i=0;i<M;i++){
          heroes[i].stat();; //เรียกเมธอดเพื่อแสดงข้อมูล
        }
    }
}


