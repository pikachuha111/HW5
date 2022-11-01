public class main {
    public static void main(String[] args) {
        Car car = new Car(10, 120, 1000, "Mercedes", 4, 12.5, "Купе", 5);
        FreightTransport freightTransport = new FreightTransport(250, 210, 3000, "Ford", 4, 15, 3 );
        Army army = new Army(1000, 600, 20000, "Aero", 30, 100, true, 2);
        car.printInfo();
        System.out.println("==============================================");
        car.consumptionResult(2.5);
//        freightTransport.loadingResult(2599);
//        for (int a = 0; a < 3; a++){
//            army.shotResult();
//        }
//        army.ejectionResult();

    }
}
