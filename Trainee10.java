
import java.util.Scanner;

public class Trainee10{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int num = 0;

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
            System.out.print("*");
        }
    }
}