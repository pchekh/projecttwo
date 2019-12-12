package pack;

public class BenzinCar extends Car {

    Benzobak benzobakType;
    public BenzinCar(String type, boolean top){
        super(type, top);
        benzobakType = Benzobak.BENZIN;
    }

}
