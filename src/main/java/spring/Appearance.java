package spring;

public abstract class Appearance {

    public abstract int cutNum();

    protected String cutName(Name name) {
        String nameStr = String.valueOf(name);
        if (nameStr.length() > cutNum()) {
            return (nameStr.substring(0, cutNum() - 3) + "...");
        }else {
            return nameStr;
        }
    }
}
