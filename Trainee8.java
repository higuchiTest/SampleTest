
import java.util.Scanner;

public class Trainee8{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int count = 1;

        int num;
        int max = 0;

        //�������[�v
        while(true){
            if(count >= 11){
                break;
            }

            //���͏���
            System.out.println("���R������͂��Ă�������");
            System.out.print(count+"���:");
            num = new Scanner(System.in).nextInt();

            //���̓`�F�b�N
            if(num<0){
                System.out.println("�O�ȏ�̐�������͂��Ă�������\n");
                continue;
            }

            //��r����
            if(num > max){
                max = num;
            }

            count++;

        }

        //�\������
        System.out.println("�ő�l��"+max); 
        
    }
}