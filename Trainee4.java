
import java.util.Scanner;

public class Trainee4{
    public static void main(String[] args) {
        
        //表示するための変数の初期化
        int sum = 1;

        //7回の繰り返し
        for(int i=1;i<8;i++){
            sum *= i;
        }

        //表示処理
        System.out.println(sum);
    }
} 