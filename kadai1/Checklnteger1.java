import java.util.Scanner;

public class Checklnteger1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("数字を入力して下さい：");
        int num = scan.nextInt();
        
        if(num == 7){
            System.out.print("大当たり！");
        } else {
            System.out.print("ハズレ");
        }
        scan.close();
    }
}