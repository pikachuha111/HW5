public class Сivil extends AeroTransport{
    private int passengersCount;
    private boolean businessClass;

    public Сivil(int pH, int speed, int weight, String mark, int wingspan, int minLength, int passengersCount, boolean businessClass) {
        super(pH, speed, weight, mark, wingspan, minLength);
        this.passengersCount = passengersCount;
        this.businessClass = businessClass;
    }
}
