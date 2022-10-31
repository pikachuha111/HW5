public class Transport {
    private int pH;
    private int speed;
    private int weight;
    private String mark;
    private double kV;

    public Transport(int pH, int speed, int weight, String mark) {
        this.pH = pH;
        this.speed = speed;
        this.weight = weight;
        this.mark = mark;
    }

    private double kVProblem(){
        this.kV = pH * 0.74;
        return this.kV;
    }
    public void printInfo(){
        System.out.println("Мощность(лошадиные силы) - " + pH);
        System.out.println("Мощность(кВ) -  " + kVProblem());
        System.out.println("Скорость(км/ч) -  " + speed);
        System.out.println("Масса(кг) -  " + weight);
        System.out.println("Марка -  " + mark);
    }

    public int getSpeed() {
        return speed;
    }

    public String getMark() {
        return mark;
    }
}