import java.util.*;

public class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public List<Student> getSortedStudents(Comparator<Student> comparator) {
        List<Student> studentList = new ArrayList<>(students.values());
        studentList.sort(comparator);
        return studentList;
    }

    public void displayStudents(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}