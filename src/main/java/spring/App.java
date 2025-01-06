package spring;

import java.util.Scanner;

public class App {

    public void menuSelect() {
        System.out.println("株式取引管理システムを開始します。");
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println("操作するメニューを選んでください。");
            System.out.println("1. 銘柄マスタ一覧表示");
            System.out.println("2. 銘柄マスタ新規登録");
//            System.out.println("3. 銘柄マスタ登録");
//            System.out.println("4. ");
            System.out.println("9. アプリケーションを終了する");
            System.out.print("入力してください：");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1" -> {
                    System.out.println("「銘柄マスタ一覧表示」が選択されました");
                }
                case "2" -> {
                    System.out.println("「銘柄マスタ新規登録」が選択されました");
                }
                case "9" -> {
                    System.out.println("アプリケーションを終了します");
                    check = false;
                }
                default -> {
                    System.out.println("\"" + userInput + "\"" + "に対応するメニューは存在しません。");
                    System.out.println("---");
                }
            }
        }
    }
}
