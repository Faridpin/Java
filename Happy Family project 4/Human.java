import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public abstract class Human {
    protected String name;
    protected String familyName;
    protected int iq;

    public Human(String name, String familyName, int iq) {
        this.name = name;
        this.familyName = familyName;
        this.iq = iq;
    }

    public abstract void greetPet();

    public abstract void uniqueMethod(); // For example, makeup for women, repairCar for men


    /* @Override
    public String toString(){
        return "Human{name=%s, surname=%s, year=%d, iq=%d, schedule=%s}".formatted(this.name, this.surname, this.dateOfBirth, this.IQ, Arrays.deepToString(schedule));
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "Human object is removed.");
    }
     */
}