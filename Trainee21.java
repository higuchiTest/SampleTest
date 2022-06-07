public class Trainee21 {
    public static void main(String[] args){
        System.out.println("サイズを入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        //行
        for(int i=0;i<num;i++){
            //列
            for(int j=0;j<num;j++){
                if(j==i || j == (num-i-1)){
                    System.out.print("x");
                }else{
                    System.out.print("　");
                }
            }
            System.out.println("");
        }
    }
}
