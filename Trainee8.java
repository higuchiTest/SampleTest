
import java.util.Scanner;

public class Trainee8{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int count = 1;

        int num;
        int max = 0;

        //無限ループ
        while(true){
            if(count >= 11){
                break;
            }

            //入力処理
            System.out.println("自然数を入力してください");
            System.out.print(count+"回目:");
            num = new Scanner(System.in).nextInt();

            //入力チェック
            if(num<0){
                System.out.println("０以上の整数を入力してください\n");
                continue;
            }

            //比較処理
            if(num > max){
                max = num;
            }

            count++;

        }

        //表示処理
        System.out.println("最大値は"+max); 
        
    }
}