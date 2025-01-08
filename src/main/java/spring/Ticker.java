package spring;

public class Ticker {
    private String value;

    public Ticker(String value) {
        // バリデーションを実行
        if (!isValidTicker(value)) {
            throw new IllegalArgumentException("不正なTicker形式です: " + value);
        }

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    private boolean isValidTicker(String value) {
        // 正規表現でバリデーション: 1桁目と3桁目は数字、2桁目と4桁目は許可された英字
        String regex = "^\\d{4}$|^[0-9][0-9AC-DF-HJ-NP-UWXY][0-9][0-9AC-DF-HJ-NP-UWXY]$";
        return value.matches(regex);
    }
}
