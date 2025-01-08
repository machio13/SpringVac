package spring;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Formatter {

    public static String isSharesIssuedFormat(long quantity) {
        BigDecimal shares = new BigDecimal(quantity);
        DecimalFormat formater = new DecimalFormat("#,###");
        return formater.format(shares);
    }
}
