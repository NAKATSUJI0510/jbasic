import java.util.Scanner;

public class Checklnteger2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ⅹの値を入力してください：");
        int num1 = scan.nextInt();
        System.out.print("ｙの値を入力してください");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.print("ｘはｙより大きいです");
        } else if(num2 > num1){
            System.out.print("ｙはｘより大きいです");
        } else if(num1 == num2){
            System.out.print("ｘとｙは等しいです");
        }

        scan.close();
    }
}