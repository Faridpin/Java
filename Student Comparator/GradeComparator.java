import java.util.*;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeCompare = Double.compare(s2.grade, s1.grade);
        if (gradeCompare != 0) return gradeCompare;
        int birthdateCompare = s1.birthdate.compareTo(s2.birthdate);
        if (birthdateCompare != 0) return birthdateCompare;
        return s1.gender.compareTo(s2.gender);
    }
}