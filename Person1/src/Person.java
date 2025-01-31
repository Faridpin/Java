public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String gender;

    public Person(String name, int age, double height, double weight, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }

    public double calculateBMI() {
        return weight / (height * height);  // BMI formula: weight (kg) / height^2 (m^2)
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday! You are now " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25, 1.65, 55.0, "Female");

        person1.introduce();
        System.out.println("BMI: " + person1.calculateBMI());
        person1.celebrateBirthday();
    }
}
