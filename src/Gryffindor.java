public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int powerMagic, int distanceMagic, int nobility, int honor, int bravery) {
        super(fullName, powerMagic, distanceMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int getInnerTotalPower() {
        return nobility + honor + bravery;
    }
    public void innerCompareTo(Gryffindor student) {
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
        return super.toString() + " благородство: " + nobility + " честь: " + honor + " храбрость: " + bravery;
    }
}
