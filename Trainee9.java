
import java.util.Scanner;

public class Trainee9{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int num;
        int max=0;
        int min=0;

        for(int i=1;i<11;i++){
             //���͏���
             System.out.println("��������͂��Ă�������");
             System.out.print(i+"���:");
             num = new Scanner(System.in).nextInt();
 
             //�����l�X�V�ݒ�
             if(max==0 && min ==0){
                 max = num;
                 min = num;
             }
 
             //��r����
             if(num > max){
                 max = num;
             }else if(num < min){
                 min = num; 
             }
        }

        //�\������
        System.out.println("�ő�l��"+max);
        System.out.println("�ŏ��l��"+min);
    }
}