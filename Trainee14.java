
import java.util.Scanner;

public class Trainee14{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        String play;
        int strike = 0;
        int boll   = 0;

        //無限ループ
        while(true){

            //条件満たしたら抜ける  上記trueの場合
            if(strike==3 || boll == 4){
                break;
            }

            //入力処理
            System.out.println("ストライク or ボール or ファール？");
            play = new Scanner(System.in,"Shift-JIS").nextLine();
            
            //入力チェック
            switch(play){
                case "ストライク":
                    strike++;
                    break;
                case "ボール":
                    boll++;
                    break;
                case "ファール":
                    if(strike<2){
                        strike++;
                    } 
                    break;
                default:
                    System.out.println("ストライクかボールかファールかを入力してください");
            }

        }

        System.out.println(boll+"ボール,"+strike+"ストライク");
    }
}