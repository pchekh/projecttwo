package pack;

public class ElectroCar extends Car {

    Benzobak benzobakType;
    public ElectroCar(String type, boolean top){
        super(type, top);
        benzobakType = Benzobak.ELECTRICITY;
    }

}
