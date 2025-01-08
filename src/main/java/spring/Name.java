package spring;

public class Name {
    private String value;

    public Name(String value) {

        if (!isValidName(value)) {
            throw new IllegalArgumentException("不正なname : " + value);
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

    private boolean isValidName(String value) {
        String regex = "[a-zA-Z0-9 .()]*";
        return value.matches(regex);
    }
}
