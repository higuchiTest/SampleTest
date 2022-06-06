
import java.util.Scanner;

public class Trainee6{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int count = 1;

        int win_count  = 0;
        int lose_count = 0;

        //無限ループ
        while(true){

            //回数制限
            if(count == 10){
                break;
            }

            //入力処理
            System.out.println("0か1を入力してください");
            int num = new Scanner(System.in).nextInt();
            
            //入力内容確認
            switch(num){
                case 0:
                    count++;
                    lose_count++;
                    break;
                case 1:
                    count++;
                    win_count++;
                    break;
                default:
                    System.out.println("入力内容が間違っています");
            }
        }

        //表示処理
        System.out.println("\n勝利数:"+win_count);
        System.out.println("負け数:"+lose_count);
    }
} 