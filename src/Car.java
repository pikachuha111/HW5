public class Car extends GroundTransport{
    private String body;
    private int passengersCount;
    private double maxLength;
    private double consumptionFuel;


    public Car(int pH, int speed, int weight, String mark, int wheelsCount, double fuelConsumption, String body, int passengersCount) {
        super(pH, speed, weight, mark, wheelsCount, fuelConsumption);
        this.body = body;
        this.passengersCount = passengersCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Кузов - " + body);
        System.out.println("Кол-во пассажиров - " + passengersCount);
    }

    public void consumptionResult(double time){
        consumption(time);
        System.out.println("За время " + time + "ч, автомобиль " + getMark() + " двигаясь с максимальной скоростью " + getSpeed() + " км/ч проедет " + maxLength + " и израсходует " + consumptionFuel + " литров топлива");
    }

    private void consumption(double time){
        int speed = getSpeed();
        String mark = getMark();
        double fuel = getFuelConsumption();
        maxLength = speed * time;
        consumptionFuel = (speed * fuel) / 100;
    }

}
