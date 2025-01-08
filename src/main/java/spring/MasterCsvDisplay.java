package spring;

import java.util.List;


public class MasterCsvDisplay extends Appearance{

    public void shouMarket(List<Stock> stockersList) {
        System.out.println("|===========================================================================|");
        System.out.println("| Ticker | Name                               | Market   | SharesIssued     |");
        System.out.println("|--------+------------------------------------+----------+------------------|");

        for (Stock stock : stockersList) {
            Ticker ticker = stock.getTicker();
            String name = cutName(stock.getName());
            Market market = stock.getMarket();
            String sharesIssued = Formatter.isSharesIssuedFormat(stock.getSharesIssued());
            System.out.printf("|  %-6s| %-34s | %-8s | %16s |\n", ticker, name, market, sharesIssued);
        }
        System.out.println("|===========================================================================|");
    }

    @Override
    public int cutNum() {
        return 33;
    }
}
