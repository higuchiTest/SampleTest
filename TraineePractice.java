public class TraineePractice {
    public static void main(String[] args){
        System.out.println("▲すごろく▼");
        System.out.println("30マス先にゴールがあります。");
        System.out.println("1,2,3の３つの目を持つ特別なサイコロ10個を、好きな数だけ振って駒を進めます。");
        System.out.println("ぴったり上がりに止まれば終わりです。目の数が多ければ、余った目の数だけ戻ります。");
        System.out.println("--------------------------------------------");

        int distance = 0;
        int count = 1;
        while(true){
            if(distance == 30){
                System.out.println("おめでとう！！ "+count+"回目で上がりです");
                System.out.print("もう一度やりますか？（1=Yes; 0=No!）");
                int result = new java.util.Scanner(System.in).nextInt();
                if(result == 0){
                    break;
                }else{
                    distance = 0;
                    count = 1;
                    continue;
                } 
            }

            for(int i=0;i<30;i++){
                if(i == distance){
                    System.out.print("▲");    
                }else{
                    System.out.print("-");
                }
            }
            System.out.println("▲|上がり！");

            System.out.print("残り"+distance+"マスです。サイコロの数は？");
            int num = new java.util.Scanner(System.in).nextInt();
            int sum = 0;
            for(int j=0;j < num;j++){
                sum += new java.util.Random().nextInt(3)+1;
            }
            System.out.println("出た目の合計"+sum);

            distance += sum;
            if(distance >30){
                distance -= 30;
            }
            
            count++;
        }
        
    }

}