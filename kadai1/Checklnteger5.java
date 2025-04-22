import java.util.Scanner;

public class Checklnteger5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("パスワード：");
        String num = scan.next();

        if(num.equals("himitu")) {
            System.out.print("一致しました");
        } else {
            System.out.print("一致しませんでした");
        }

        scan.close();

    }
}