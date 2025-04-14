import java.util.Comparator;

public class StudentComparator {
    public static Comparator<Student> byName = Comparator.comparing(Student::getName);
    public static Comparator<Student> byAge = Comparator.comparingInt(Student::getAge);
}