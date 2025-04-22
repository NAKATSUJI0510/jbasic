import java.util.Scanner;

public class Checklnteger3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("年齢を入力して下さい：");
        int num = scan.nextInt();

        if(0 <= num && 130 >= num){
            System.out.print("正しい年齢です");
        } else if(0 > num) {
            System.out.print("０～１３０で入力して下さい");
        } else if(130 < num) {
            System.out.print("０～１３０で入力して下さい");
        }

        scan.close();
    }
}