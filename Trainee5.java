
import java.util.Scanner;

public class Trainee5{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int sum = 0;

        System.out.println("�����l����͂��Ă�������");
        
        //10��̌J��Ԃ�
        for(int i=1;i<11;i++){
            System.out.print(i+"���:");
            int num = new Scanner(System.in).nextInt();            
            sum += num;
        }

        //�\������
        System.out.println("�����v�̕��ϓ_��"+sum/10);
    }
} 