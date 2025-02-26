// Abstract class representing a TV, extending Device
public abstract class TV extends Device {
    private int screenSize;

    public TV(String model, int screenSize) {
        super(model);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    // Abstract method (must be implemented by brand-specific classes)
    public abstract void displayBrand();

    // Concrete method
    public void changeChannel(String channel) {
        System.out.println("Changing to channel " + channel);
    }

    // Final method (cannot be overridden)
    public final void showResolution() {
        System.out.println("This TV supports 4K resolution.");
    }
}
