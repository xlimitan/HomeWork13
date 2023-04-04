public class Slytherin extends Hogwarts{
    private int tricky;
    private int resolute;
    private int ambitious;
    private int resourceful;
    private int power;

    public Slytherin(String fullName, int powerMagic, int distanceMagic, int tricky, int resolute, int ambitious, int resourceful, int power) {
        super(fullName, powerMagic, distanceMagic);
        this.tricky = tricky;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.power = power;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
