
import java.util.Scanner;

public class Trainee7{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int count = 1;

        int num1,num2;

        int k_point = 0;
        int h_point = 0;

        //無限ループ
        while(true){

            //延長戦考慮
            if(count >= 10 && k_point!=h_point){
                break;
            }else if(count==10){
                System.out.println("延長戦入りました！");
            }

            //入力処理
            System.out.print(count+"回表、巨人の得点は？");
            num1 = new Scanner(System.in).nextInt();

            if(num1>=0){
                k_point += num1;
            }else{
                System.out.println("入力値がありえない数字です");
                continue;
            }

            System.out.print(count+"回裏、阪神の得点は？"); 
            num2 = new Scanner(System.in).nextInt();
            
            if(num2>=0){
                h_point += num2;
            }else{
                System.out.println("入力値がありえない数字です\n");
                continue;
            }

            count++;
        }

        //表示処理
        System.out.println("巨人："+k_point+"点, 阪神："+h_point+"点");
        if(k_point>h_point){
            System.out.println("巨人の勝ち");
        }else{
            System.out.println("阪神の勝ち");
        }
        
    }
}