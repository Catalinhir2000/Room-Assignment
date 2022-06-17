package compulsory;

public class ComputerLab extends Room{
    private String OS = new String();



    public ComputerLab(String name, int capacity, String OS) {
        super(name, capacity);
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
