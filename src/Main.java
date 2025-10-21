import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GradeProcessor gradeProcessor = new GradeProcessor();
        int[] grades = {29, 37, 38, 41, 84, 67};
        System.out.println("Failing grades: " + Arrays.toString(gradeProcessor.failingGrades(grades)));
        System.out.printf("Average grade: %.2f\n", gradeProcessor.averageGrade(grades));
        System.out.println("Rounded grades: " + Arrays.toString(gradeProcessor.roundedGrades(grades)));
        System.out.println("Max grade: " + gradeProcessor.maxGrade(grades));
    }
}