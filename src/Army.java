public class Army extends AeroTransport {
    private boolean ejectionSystem;
    private int rocketsCount;

    public Army(int pH, int speed, int weight, String mark, int wingspan, int minLength, boolean ejectionSystem, int rocketsCount) {
        super(pH, speed, weight, mark, wingspan, minLength);
        this.ejectionSystem = ejectionSystem;
        this.rocketsCount = rocketsCount;
    }

    private void shot() {
        if (rocketsCount <= 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else System.out.println("Ракета пошла... ");
        this.rocketsCount--;
    }

    public void shotResult() {
        shot();
    }

    private void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else System.out.println("У вас нет такой системы");
    }

    public void ejectionResult () {
        ejection();
    }
}
