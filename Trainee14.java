
import java.util.Scanner;

public class Trainee14{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        String play;
        int strike = 0;
        int boll   = 0;

        //�������[�v
        while(true){

            //�������������甲����  ��Ltrue�̏ꍇ
            if(strike==3 || boll == 4){
                break;
            }

            //���͏���
            System.out.println("�X�g���C�N or �{�[�� or �t�@�[���H");
            play = new Scanner(System.in,"Shift-JIS").nextLine();
            
            //���̓`�F�b�N
            switch(play){
                case "�X�g���C�N":
                    strike++;
                    break;
                case "�{�[��":
                    boll++;
                    break;
                case "�t�@�[��":
                    if(strike<2){
                        strike++;
                    } 
                    break;
                default:
                    System.out.println("�X�g���C�N���{�[�����t�@�[��������͂��Ă�������");
            }

        }

        System.out.println(boll+"�{�[��,"+strike+"�X�g���C�N");
    }
}