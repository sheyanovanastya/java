import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Настя", 20, 61.9));
        manager.addStudent(new Student(2, "Яринка", 18, 77.7));
        manager.addStudent(new Student(3, "Іра", 19, 92.7));
        manager.addStudent(new Student(4, "Ніка", 17, 78.1));

        System.out.println("Сортування за середнім балом:");
        List<Student> sortedByGrade = manager.getSortedStudents(Comparator.naturalOrder());
        manager.displayStudents(sortedByGrade);

        System.out.println("\nСортування за ім’ям:");
        List<Student> sortedByName = manager.getSortedStudents(StudentComparator.byName);
        manager.displayStudents(sortedByName);

        System.out.println("\nСортування за віком:");
        List<Student> sortedByAge = manager.getSortedStudents(StudentComparator.byAge);
        manager.displayStudents(sortedByAge);

        System.out.println("\nВидалення студента з ID 2:");
        manager.removeStudent(2);
        manager.displayStudents(manager.getSortedStudents(Comparator.naturalOrder()));
    }
}