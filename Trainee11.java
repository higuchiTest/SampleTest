
import java.util.Scanner;

public class Trainee11{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int num     = 0;
        int count   = 0;

        for(;;){
            System.out.println("���͂�����������͂��Ă�������");
            num = new Scanner(System.in).nextInt();

            if(num<=0){
                System.out.println("\n1�ȏ�̐�������͂��Ă�������\n");
                continue;
            }
            //��L�𖞂�������A������
            break;
        }

        //���͂����������\��
        for(int i=0;i<num;i++){
            if(count>=10){
                count = 0;    
            } 
            System.out.print(count);
            count++;
        }
    }
}