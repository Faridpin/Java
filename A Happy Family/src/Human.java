import java.util.Random;
class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet() {
        System.out.println("I have a " + pet.species + " is " + pet.age + " years old, he is " + (pet.trickLevel > 50 ? "very sly" : "almost not sly"));
    }

    boolean feedPet(boolean isTimeForFeeding) {
        Random random = new Random();
        int chance = random.nextInt(101);
        if (isTimeForFeeding || pet.trickLevel > chance) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            System.out.println("I think " + name + " is not hungry.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + pet + "}";
    }
}
