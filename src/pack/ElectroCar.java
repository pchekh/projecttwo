package pack;

public class ElectroCar extends Car {

    benzobak benzobakType;
    public ElectroCar(String type, boolean top){
        super(type, top);
        benzobakType = benzobak.ELECTRICITY;
    }

    public void goHome() {

        System.out.println(" ");
        System.out.println(benzobakType + "  Wrong fuel");

        if (top = false) {
            System.out.println("No fuel!");
        } else if (top = true) {
            System.out.println("Fuel is ready");
        }
        switch (type) {
            case "avtomat":
                System.out.println("Auto - go home!");
                break;
            case "neAvtomat":
                System.out.println("I can't");
                break;
        }

    }


}
