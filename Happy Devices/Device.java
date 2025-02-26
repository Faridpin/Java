public abstract class Device {
    private String model;

    public Device(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public abstract void powerOn();

    public void powerOff() {
        System.out.println("Device is powering off...");
    }
}
