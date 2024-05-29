import java.util.Scanner;

    class Route{
        public String name[];
        public int distances[];
        public Route(String[] name,int[] distances){
            this.name=name;
            this.distances = distances;
          
        } 
        void getStopInfo(int num){
            if(num<0 || num>name.length-1 ){
                
                System.out.println("invalid number");
            }
            else{
                System.out.println(name[num]+" "+distances[num]);
            }
        }
        void summarizeRoute(){
            int sum=0;
            System.out.print(name[0]+" ");
            for(int i=0;i<=name.length-1;i++){
                sum+=distances[i];
            }
            
            System.out.println(name[name.length-1]+" "+sum);
        }
        void getTripInfo(int up,int down){
            int sum=0;
            if(up<down && up>0 && down>0 && up<=name.length-1 && down<=name.length-1){ // 2 7
                for(int i=up-1;i<=down-1;i++){
                    sum+=distances[i];
                }
                System.out.print(name[up-1]+" ");
                System.out.println(name[down-1]+" "+sum);

            }
            else{
                System.out.println("invalid number");
                // System.out.println(name.length);
            }
        }
    }

    public class BusRoute1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] distances = new int[N];
        for(int  i=0;i<N;i++) {
        names[i] = scan.next();
        distances[i] = scan.nextInt();
        }
        Route R = new Route(names, distances); // Create a Route object here.
        int K = scan.nextInt();
        for(int i=0;i<K;i++){
            int start = scan.nextInt();
            int stop = scan.nextInt();
            R.getTripInfo(start,stop);
        }
        // final int K = scan.nextInt();
        // for(int i = 0; i < K; ++i) {
        // int num = scan.nextInt();
        //  R.getStopInfo(num-1);
        // }
        // R.summarizeRoute();

    }
}