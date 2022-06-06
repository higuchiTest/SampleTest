
import java.util.Scanner;

public class Trainee5{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int sum = 0;

        System.out.println("整数値を入力してください");
        
        //10回の繰り返し
        for(int i=1;i<11;i++){
            System.out.print(i+"回目:");
            int num = new Scanner(System.in).nextInt();            
            sum += num;
        }

        //表示処理
        System.out.println("総合計の平均点は"+sum/10);
    }
} 