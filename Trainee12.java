
import java.util.Scanner;

public class Trainee12{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int sum   = 0;

        for(;;){
            System.out.println("整数を入力してください");
            System.out.println("※合計が100以上になったら終わります");
            sum += new Scanner(System.in).nextInt();

            if(sum>=100){
                break;
            }
        }

        System.out.println("合計値は:"+sum);
    } 
}