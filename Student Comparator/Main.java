import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", "Brown", 85.5, "Female", new Date(100, 5, 21)));
        students.add(new Student(1, "Bob", "Smith", 90.0, "Male", new Date(98, 2, 15)));
        students.add(new Student(2, "Charlie", "Davis", 85.5, "Male", new Date(100, 5, 21)));

        Collections.sort(students);
        System.out.println("Sorted by ID:");
        students.forEach(System.out::println);

        students.sort(new GradeComparator());
        System.out.println("\nSorted by Grade, Birthdate, and Gender:");
        students.forEach(System.out::println);



        students.sort((s1, s2) -> {
            int gradeCompare = Double.compare(s2.grade, s1.grade);
            if (gradeCompare != 0) return gradeCompare;
            int birthdateCompare = s1.birthdate.compareTo(s2.birthdate);
            if (birthdateCompare != 0) return birthdateCompare;
            return s1.gender.compareTo(s2.gender);
        });

        System.out.println("\nSorted using Lambda:");
        students.forEach(System.out::println);
    }
}
