
import java.util.Scanner;

public class Trainee16{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int num = 0;

        //入力
        while(num<=0){
            System.out.println("2以上の整数を入力してください");
            num = new Scanner(System.in).nextInt();
            if(num<0){
                System.out.println("\n2以上ではありません\n");
            }
        }

        //
        for(int i=2;num>1;i++){
            //割り切れるものがあるかチェック
            while((num % i) == 0){
                System.out.println(i+" ");
                //あまりなしのため、割り切り
                num /= i;     
            }
        }
    }
}