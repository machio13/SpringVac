package spring;

public class Stock {
    private Ticker ticker;
    private Name name;
//    private String name;
    private Market market;
    private long sharesIssued;

    public Stock(Ticker ticker, Name name, Market market, long sharesIssued) {
        this.ticker = ticker;
        this.name = name;
        this.market = market;
        this.sharesIssued = sharesIssued;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public Name getName() {
        return name;
    }

    public Market getMarket() {
        return market;
    }

    public long getSharesIssued() {
        return sharesIssued;
    }
}
