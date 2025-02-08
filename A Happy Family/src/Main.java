public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet pet2 = new Pet("cat", "Whiskers");
        Pet pet3 = new Pet();

        Human father = new Human("Vito", "Karleone", 1945);
        Human mother = new Human("Jane", "Karleone", 1950);

        Human child = new Human("Michael", "Karleone", 1977, 90, pet1, father, mother, new String[][]{
                {"Monday", "Go to the gym"},
                {"Tuesday", "Attend meetings"}
        });

        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);

        pet1.eat();
        pet1.respond();
        pet1.foul();

        child.greetPet();
        child.describePet();
        child.feedPet(false);
    }
}
