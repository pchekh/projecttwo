package pack;

public class DieselCar extends Car {

    Benzobak benzobakType;
    public DieselCar(String type, boolean top){
        super(type, top);
        benzobakType = Benzobak.DIZEL;
    }

}
