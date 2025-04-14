import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    //спосіб 1
    private static final Function<Integer, String> gradeToText1 = grade -> {
        if (grade >= 89) return "відмінно";
        if (grade >= 75) return "добре";
        if (grade >= 51) return "задовільно";
        return "незадовільно";
    };

    //спосіб 2
    private static String convertGrade(Integer grade) {
        if (grade >= 89) return "відмінно";
        if (grade >= 75) return "добре";
        if (grade >= 51) return "задовільно";
        return "Незадовільно";
    }

    //метод Function
    public static void testGradeFunction(Function<Integer, String> function, List<Integer> grades) {
        for (int grade : grades) {
            System.out.println("оцінка " + grade + " -> " + function.apply(grade));
        }
    }

    //спосіб 1
    private static final Predicate<Integer> isMasterStudent1 = course -> course >= 5;

    //спосіб 2
    private static boolean isMaster(Integer course) {
        return course >= 5;
    }

    //метод Predicate
    public static void testCoursePredicate(Predicate<Integer> predicate, List<Integer> courses) {
        for (int course : courses) {
            System.out.println("курс " + course + " -> " + (predicate.test(course) ? "магістр" : "бакалавр"));
        }
    }

    public static void main(String[] args) {
        List<Integer> testGrades = Arrays.asList(95, 80, 70, 50);
        System.out.println("перевірка оцінок:");
        testGradeFunction(gradeToText1, testGrades);

        List<Integer> testCourses = Arrays.asList(1, 2, 5);
        System.out.println("\nперевірка курсу студента:");
        testCoursePredicate(isMasterStudent1, testCourses);

        List<Integer> grades = Arrays.asList(95, 85, 75, 65, 55, 45);

        //спосіб 1 без Stream
        List<Integer> passedGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 51) {
                passedGrades.add(grade);
            }
        }
        System.out.println("\nоцінки без Stream:");
        for (int grade : passedGrades) {
            System.out.println(grade + " -> " + gradeToText1.apply(grade));
        }

        //спосіб 2 з Stream
        System.out.println("\nоцінки зі Stream:");
        grades.stream()
                .filter(grade -> grade >= 51)
                .map(gradeToText1)
                .forEach(System.out::println);
    }
}