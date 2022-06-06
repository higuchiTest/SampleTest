
import java.util.Scanner;

public class Trainee15{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int num = 0;

        //入力
        while(num<=0){
            System.out.println("整数を入力してください");
            num = new Scanner(System.in).nextInt();
            if(num<0){
                System.out.println("\n正の整数を入力してください\n");
            }
        }

        int[] nums = new int[num];
        int count = 0;

        //素数は対象の数の半分の以下で設定されている数字にあるとされている
        for(int i=2;i<num;i++){
            int flg = 0;
            for(int j=2;j<=i/2;j++){
                //割り切れるものがあるかチェック
                if(i % j == 0){
                    flg++;
                }
            }
            if(flg == 0){
                nums[count] = i;
                count++;
            }
        }
        
        for(int result:nums){
            if(result == 0 || result<=10000) continue;
            System.out.println(result);
        }

    }
}