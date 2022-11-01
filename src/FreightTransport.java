public class FreightTransport extends GroundTransport{
    private int loadCapacity;

    public FreightTransport(int pH, int speed, int weight, String mark, int wheelsCount, double fuelConsumption, int loadCapacity) {
        super(pH, speed, weight, mark, wheelsCount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    private void loading (int kilograms){
        int loadCapacity = this.loadCapacity * 1000;
        if (kilograms < loadCapacity){
            System.out.println("Грузовик загружен!");
        } else System.out.println("Вам нужен грузовик побольше");
    }

    public void loadingResult (int kilograms){
        loading(kilograms);
    }
}
