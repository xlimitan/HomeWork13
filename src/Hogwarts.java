public class Hogwarts {
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
}
