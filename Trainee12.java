
import java.util.Scanner;

public class Trainee12{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int sum   = 0;

        for(;;){
            System.out.println("��������͂��Ă�������");
            System.out.println("�����v��100�ȏ�ɂȂ�����I���܂�");
            sum += new Scanner(System.in).nextInt();

            if(sum>=100){
                break;
            }
        }

        System.out.println("���v�l��:"+sum);
    } 
}