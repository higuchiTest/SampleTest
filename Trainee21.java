public class Trainee21 {
    public static void main(String[] args){
        System.out.println("�T�C�Y����͂��Ă�������");
        int num = new java.util.Scanner(System.in).nextInt();
        //�s
        for(int i=0;i<num;i++){
            //��
            for(int j=0;j<num;j++){
                if(j==i || j == (num-i-1)){
                    System.out.print("x");
                }else{
                    System.out.print("�@");
                }
            }
            System.out.println("");
        }
    }
}
