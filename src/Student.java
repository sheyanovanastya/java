import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private double averageGrade;

    public Student(int id, String name, int age, double averageGrade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade); // Сортування за спаданням середнього балу
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", averageGrade=" + averageGrade + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}