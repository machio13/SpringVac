package spring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MasterCsvReader {

    public static List<Stock> readMasterCsv(List<String[]> csvData) {
        List<Stock> stockList = new ArrayList<>();

        for (String[] wordBox : csvData) {
            try {
                Ticker ticker = new Ticker(wordBox[0]);
                Name name = new Name(wordBox[1]);
                Market market = Market.isRename(wordBox[2]);
                long shareIssued = Long.parseLong(wordBox[3]);

                stockList.add(new Stock(ticker, name, market, shareIssued));
            }catch (NumberFormatException e) {
                System.out.println("正しく数値が変換できていません。");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("CSVデータの形式が不正です。");
            }catch (IllegalArgumentException e) {
                System.out.println("データに問題があります。確認してください。");
            }
        }
        return stockList;
    }
}