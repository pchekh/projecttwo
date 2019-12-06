package pack;

public enum benzobak {
    BENZIN("Benzin"),
    DIZEL("Dieselnoe toplivo"),
    ELECTRICITY("Electrichestvo");

    public String benzobakType;

    benzobak(String benzobakType){
        this.benzobakType = benzobakType;
    }


}