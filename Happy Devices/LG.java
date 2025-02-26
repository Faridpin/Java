public class LG extends TV {
    public LG(String model, int screenSize) {
        super(model, screenSize);
    }

    @Override
    public void powerOn() {
        System.out.println("LG TV is powering on...");
    }

    @Override
    public void displayBrand() {
        System.out.println("Brand: LG");
    }
}
