package pack;

public enum Benzobak {
    BENZIN("benzin"),
    DIZEL("dizel"),
    ELECTRICITY("electricity");

    public String benzobakType;

    Benzobak(String benzobakType) {
        this.benzobakType = benzobakType;
    }
}
