public class Main {
    public static void main(String[] args) {
        String[] habits = {"eating", "running", "sleeping"};
        Pet pet = new Pet(Species.DOG, "Cinnamon", 1, 65, habits);

        String[][] activities = {{DayOfWeek.SATURDAY.getName(),DayOfWeek.SUNDAY.getName()},{"Study"}};

        Human mother = new Human("Aytan", "Alili", 1980);
        mother.setSchedule(activities);
        Human father = new Human("Asif", "Alili", 1963);
        Family family = new Family(mother, father);
        family.setPet(pet);

        Human child1 = new Human("Valida", "Alili", 2001, family);
        Human child2 = new Human("Naira", "Alili", 2007, family);


        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.addChild(child1);
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.addChild(child2);
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.deleteChild(child1);
        for (int i = 0; i < 10000000; i++) {
            if (family.deleteChild(child1)) {
                System.gc();
            }
        }
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();

        family.deleteChildrenWithIndex(0);
        for (int i = 0; i < 10000000; i++) {
            if (family.deleteChild(child1)) {
                System.gc();
            }
        }
        System.out.println(family);
        System.out.println("The number of family members: " + family.countFamily());
        System.out.println();
    }
}
