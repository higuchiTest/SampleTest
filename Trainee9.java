
import java.util.Scanner;

public class Trainee9{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int num;
        int max=0;
        int min=0;

        for(int i=1;i<11;i++){
             //入力処理
             System.out.println("整数を入力してください");
             System.out.print(i+"回目:");
             num = new Scanner(System.in).nextInt();
 
             //初期値更新設定
             if(max==0 && min ==0){
                 max = num;
                 min = num;
             }
 
             //比較処理
             if(num > max){
                 max = num;
             }else if(num < min){
                 min = num; 
             }
        }

        //表示処理
        System.out.println("最大値は"+max);
        System.out.println("最小値は"+min);
    }
}