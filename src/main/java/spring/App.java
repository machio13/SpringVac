package spring;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class App {

    public void menuSelect() {
        System.out.println("株式取引管理システムを開始します。");
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        File masterFile = new File("src/main/java/spring/Master.csv");

        while (check) {
            System.out.println("操作するメニューを選んでください。");
            System.out.println("1. 銘柄マスタ一覧表示");
            System.out.println("2. 銘柄マスタ新規登録");
            System.out.println("3. 取引入力");
            System.out.println("4. 取引一覧表示");
            System.out.println("9. アプリケーションを終了する");
            System.out.print("入力してください：");
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1" -> {
                    System.out.println("「銘柄マスタ一覧表示」が選択されました");
                    List<String[]> reader = Reader.CsvReader(masterFile);
                    List<Stock> stockList = MasterCsvReader.readMasterCsv(reader);
                    MasterCsvDisplay display = new MasterCsvDisplay();
                    display.shouMarket(stockList);
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
