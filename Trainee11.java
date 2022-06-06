
import java.util.Scanner;

public class Trainee11{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int num     = 0;
        int count   = 0;

        for(;;){
            System.out.println("入力したい個数を入力してください");
            num = new Scanner(System.in).nextInt();

            if(num<=0){
                System.out.println("\n1以上の整数を入力してください\n");
                continue;
            }
            //上記を満たしたら、抜ける
            break;
        }

        //入力した分だけ表示
        for(int i=0;i<num;i++){
            if(count>=10){
                count = 0;    
            } 
            System.out.print(count);
            count++;
        }
    }
}