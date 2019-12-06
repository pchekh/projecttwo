package pack;

    public class GoHome {

        public static void main(String[] args) {

            Car peugeot = new BenzinCar("avtomat", true);
            Car peugeot1 = new BenzinCar("neAvtomat", true);
            Car gazel = new DieselCar("avtomat", true);
            Car gazel1 = new DieselCar("neAvtomat", false);
            Car tesla = new ElectroCar("avtomat", true);
            Car tesla1 = new ElectroCar("avtomat", false);


            ((BenzinCar) peugeot).goHome();
            ((BenzinCar) peugeot1).goHome();
            ((DieselCar) gazel).goHome();
            ((DieselCar) gazel1).goHome();
            ((ElectroCar) tesla).goHome();
            ((ElectroCar) tesla1).goHome();

        }
    }

