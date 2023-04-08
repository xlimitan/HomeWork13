public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String fullName, int powerMagic, int distanceMagic, int smart, int wise, int witty, int creative) {
        super(fullName, powerMagic, distanceMagic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    private int getInnerTotalPower() {
        return smart + wise + witty + creative;
    }
    public void innerCompareTo(Ravenclaw student) {
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
        return super.toString() + " умный: " + smart + " мудрый: " + wise + " остроумный: " + witty + " творческий: " + creative;
    }
}
