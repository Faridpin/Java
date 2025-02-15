public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet cat = new Pet("cat", "Whiskers", 3, 60, new String[]{"eat", "sleep"});

        Human mother = new Human("Jane", "Karleone", 1975);
        Human father = new Human("Vito", "Karleone", 1970);

        Family karleoneFamily = new Family(mother, father);
        karleoneFamily.setPet(dog);  // Assigning pet to the family

        Human child1 = new Human("Michael", "Karleone", 2000);
        Human child2 = new Human("Sofia", "Karleone", 2005);

        karleoneFamily.addChild(child1);
        karleoneFamily.addChild(child2);

        child1.setFamily(karleoneFamily);
        child2.setFamily(karleoneFamily);

        System.out.println("Family Information:");
        System.out.println(karleoneFamily);

        System.out.println("\nHuman Information:");
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child1);
        System.out.println(child2);

        System.out.println("\nDeleting a child from the family:");
        karleoneFamily.deleteChild(1);
        System.out.println(karleoneFamily);

        System.out.println("\nDeleting a child by object:");
        karleoneFamily.deleteChild(1);
        System.out.println(karleoneFamily);
    }
}

