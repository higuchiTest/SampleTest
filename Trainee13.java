
import java.util.Scanner;

public class Trainee13{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int num = 0;
        int strike = 0;
        int boll   = 0;

        //�������[�v
        while(!(strike==3 || boll == 4)){

            //�������������甲����  ��Ltrue�̏ꍇ
            // if(strike==3 || boll == 4){
            //     break;
            // }

            //���͏���
            System.out.println("�X�g���C�N=1 or �{�[��=2 �H");
            num = new Scanner(System.in).nextInt();
            
            //���̓`�F�b�N
            switch(num){
                case 1:
                    strike++; 
                    break;
                case 2:
                    boll++;
                    break;
                default:
                    System.out.println("1��2����͂��Ă�������");
            }

        }

        System.out.println(boll+"�{�[��,"+strike+"�X�g���C�N");
    }
}