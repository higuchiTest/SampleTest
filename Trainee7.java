
import java.util.Scanner;

public class Trainee7{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int count = 1;

        int num1,num2;

        int k_point = 0;
        int h_point = 0;

        //�������[�v
        while(true){

            //������l��
            if(count >= 10 && k_point!=h_point){
                break;
            }else if(count==10){
                System.out.println("���������܂����I");
            }

            //���͏���
            System.out.print(count+"��\�A���l�̓��_�́H");
            num1 = new Scanner(System.in).nextInt();

            if(num1>=0){
                k_point += num1;
            }else{
                System.out.println("���͒l�����肦�Ȃ������ł�");
                continue;
            }

            System.out.print(count+"�񗠁A��_�̓��_�́H"); 
            num2 = new Scanner(System.in).nextInt();
            
            if(num2>=0){
                h_point += num2;
            }else{
                System.out.println("���͒l�����肦�Ȃ������ł�\n");
                continue;
            }

            count++;
        }

        //�\������
        System.out.println("���l�F"+k_point+"�_, ��_�F"+h_point+"�_");
        if(k_point>h_point){
            System.out.println("���l�̏���");
        }else{
            System.out.println("��_�̏���");
        }
        
    }
}