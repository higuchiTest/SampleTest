public class TraineePractice {
    public static void main(String[] args){
        System.out.println("�������낭��");
        System.out.println("30�}�X��ɃS�[��������܂��B");
        System.out.println("1,2,3�̂R�̖ڂ������ʂȃT�C�R��10���A�D���Ȑ������U���ċ��i�߂܂��B");
        System.out.println("�҂�����オ��Ɏ~�܂�ΏI���ł��B�ڂ̐���������΁A�]�����ڂ̐������߂�܂��B");
        System.out.println("--------------------------------------------");

        int distance = 0;
        int count = 1;
        while(true){
            if(distance == 30){
                System.out.println("���߂łƂ��I�I "+count+"��ڂŏオ��ł�");
                System.out.print("������x���܂����H�i1=Yes; 0=No!�j");
                int result = new java.util.Scanner(System.in).nextInt();
                if(result == 0){
                    break;
                }else{
                    distance = 0;
                    count = 1;
                    continue;
                } 
            }

            for(int i=0;i<30;i++){
                if(i == distance){
                    System.out.print("��");    
                }else{
                    System.out.print("-");
                }
            }
            System.out.println("��|�オ��I");

            System.out.print("�c��"+distance+"�}�X�ł��B�T�C�R���̐��́H");
            int num = new java.util.Scanner(System.in).nextInt();
            int sum = 0;
            for(int j=0;j < num;j++){
                sum += new java.util.Random().nextInt(3)+1;
            }
            System.out.println("�o���ڂ̍��v"+sum);

            distance += sum;
            if(distance >30){
                distance -= 30;
            }
            
            count++;
        }
        
    }

}