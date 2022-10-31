public class AeroTransport extends Transport{
    private int wingspan;
    private int minLength;

    public AeroTransport(int pH, int speed, int weight, String mark, int wingspan, int minLength) {
        super(pH, speed, weight, mark);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }
}
