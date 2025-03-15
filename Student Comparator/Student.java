import java.util.*;

public class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    double grade;
    String gender;
    Date birthdate;

    public Student(int id, String name, String surname, double grade, String gender, Date birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
