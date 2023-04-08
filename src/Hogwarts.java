public abstract class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int distanceMagic;

    public Hogwarts(String fullName, int powerMagic, int distanceMagic) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.distanceMagic = distanceMagic;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceMagic() {
        return distanceMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setDistanceMagic(int distanceMagic) {
        this.distanceMagic = distanceMagic;
    }

    private int getTotalPower() {
        return powerMagic + distanceMagic;
    }
    public void compareTo (Hogwarts student) {
        if (student.getTotalPower() < this.getTotalPower()) {
            System.out.println("Сильнее " + this.fullName);
        } else if (student.getTotalPower() > this.getTotalPower()) {
            System.out.println("Сильнее " + student.fullName);
        } else {
            System.out.println("Ученики ранвны по силе");
        }
    }
    @Override
    public String toString() {
        return "Студент " + fullName + " сила магии: " + powerMagic + " трансгрессия: " + distanceMagic;
    }
}
