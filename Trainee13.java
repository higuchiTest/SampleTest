
import java.util.Scanner;

public class Trainee13{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int num = 0;
        int strike = 0;
        int boll   = 0;

        //無限ループ
        while(!(strike==3 || boll == 4)){

            //条件満たしたら抜ける  上記trueの場合
            // if(strike==3 || boll == 4){
            //     break;
            // }

            //入力処理
            System.out.println("ストライク=1 or ボール=2 ？");
            num = new Scanner(System.in).nextInt();
            
            //入力チェック
            switch(num){
                case 1:
                    strike++; 
                    break;
                case 2:
                    boll++;
                    break;
                default:
                    System.out.println("1か2を入力してください");
            }

        }

        System.out.println(boll+"ボール,"+strike+"ストライク");
    }
}