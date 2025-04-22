import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //キーボードから名前を受け取り「ようこそ、（入力された名前）さん」と表示
        Scanner scan = new Scanner(System.in);

        System.out.print("お名前は？");
        String name = scan.next();

        System.out.print("ようこそ、" + name + "さん");

        scan.close();
    }
}