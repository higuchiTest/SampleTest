
import java.util.Scanner;

public class Trainee15{
    public static void main(String[] args) {
        
        //�\�����邽�߂̕ϐ��̏�����
        int num = 0;

        //����
        while(num<=0){
            System.out.println("��������͂��Ă�������");
            num = new Scanner(System.in).nextInt();
            if(num<0){
                System.out.println("\n���̐�������͂��Ă�������\n");
            }
        }

        int[] nums = new int[num];
        int count = 0;

        //�f���͑Ώۂ̐��̔����̈ȉ��Őݒ肳��Ă��鐔���ɂ���Ƃ���Ă���
        for(int i=2;i<num;i++){
            int flg = 0;
            for(int j=2;j<=i/2;j++){
                //����؂����̂����邩�`�F�b�N
                if(i % j == 0){
                    flg++;
                }
            }
            if(flg == 0){
                nums[count] = i;
                count++;
            }
        }
        
        for(int result:nums){
            if(result == 0 || result<=10000) continue;
            System.out.println(result);
        }

    }
}