import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getFailedStudents() {
        return students.stream().filter(Student::hasFailed).toList();
    }
}