
import java.util.Scanner;

public class Trainee6{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int count = 1;

        int win_count  = 0;
        int lose_count = 0;

        //�������[�v
        while(true){

            //�񐔐���
            if(count == 10){
                break;
            }

            //���͏���
            System.out.println("0��1����͂��Ă�������");
            int num = new Scanner(System.in).nextInt();
            
            //���͓��e�m�F
            switch(num){
                case 0:
                    count++;
                    lose_count++;
                    break;
                case 1:
                    count++;
                    win_count++;
                    break;
                default:
                    System.out.println("���͓��e���Ԉ���Ă��܂�");
            }
        }

        //�\������
        System.out.println("\n������:"+win_count);
        System.out.println("������:"+lose_count);
    }
} 