public class Main {
    public static void main(String[] args) {
        TV lGTV = new LG("LG OLED QNED",55);
        TV samsungTV = new Samsung("Samsung QE 75",65);
        lGTV.powerOn();
        lGTV.displayBrand();
        lGTV.showResolution();
        lGTV.changeChannel("ANS");
        lGTV.powerOff();

        samsungTV.powerOn();
        samsungTV.displayBrand();
        samsungTV.showResolution();
        samsungTV.changeChannel("ATV");
        samsungTV.powerOff();
    }
}