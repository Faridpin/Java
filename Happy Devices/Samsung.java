public class Samsung extends TV {
    public Samsung(String model, int screenSize) {
        super(model, screenSize);
    }
    @Override
    public void powerOn() {
        System.out.println("Samsung TV is powering on...");
    }

    @Override
    public void displayBrand() {
        System.out.println("Brand: Samsung");
    }
}
