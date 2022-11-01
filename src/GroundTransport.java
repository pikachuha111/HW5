public class GroundTransport extends Transport {
    private int wheelsCount;
    private double fuelConsumption;

    public GroundTransport(int pH, int speed, int weight, String mark, int wheelsCount, double fuelConsumption) {
        super(pH, speed, weight, mark);
        this.wheelsCount = wheelsCount;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Кол-во колес - " + wheelsCount);
        System.out.println("Расход топлива(л/100км) - " + fuelConsumption);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
