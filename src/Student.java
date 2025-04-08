import java.util.HashMap;
import java.util.Map;

public class Student {
    protected String name;
    protected Map<String, Integer> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public double calculateAverage() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public boolean hasFailed() {
        return grades.values().stream().anyMatch(grade -> grade < 60);
    }
}

class Undergraduate extends Student {
    public Undergraduate(String name) {
        super(name);
    }
}

class Graduate extends Student {
    public Graduate(String name) {
        super(name);
    }
}