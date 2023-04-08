public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int right;
    private int honest;

    public Hufflepuff(String fullName, int powerMagic, int distanceMagic, int hardworking, int right, int honest) {
        super(fullName, powerMagic, distanceMagic);
        this.hardworking = hardworking;
        this.right = right;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    private int getInnerTotalPower() {
        return hardworking + right + honest;
    }
    public void innerCompareTo(Hufflepuff student) {
        if (student.getInnerTotalPower() < this.getInnerTotalPower()) {
            System.out.println("Сильнее " + this.getFullName());
        } else if (student.getInnerTotalPower() > this.getInnerTotalPower()) {
            System.out.println("Сильнее " + student.getFullName());
        } else {
            System.out.println("Ученики ранвны по силе");
        }
    }
    @Override
    public String toString(){
        return super.toString() + " трудолюбивый: " + hardworking + " верный: " + right + " честный: " + honest;
    }
}
