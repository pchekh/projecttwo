package pack;

public class Car {

    String type;
    boolean top;


    public Car(String type, boolean top) {
        this.type = type;
        this.top = top;

    }

    public void goHome() {

        System.out.println(" ");
        System.out.println(Benzobak.values() + "  Wrong fuel");

        if (top = false) {
            System.out.println("No fuel!");
        } else {
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