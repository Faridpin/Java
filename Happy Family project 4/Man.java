public class Man extends Human {
    public Man(String name, String familyName, int iq) {
        super(name, familyName, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello, pet! I'm your dad.");
    }

    @Override
    public void uniqueMethod() {
        System.out.println("It will work better than before");
    }
}