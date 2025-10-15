import java.util.ArrayList;
import java.util.List;
public class GradeProcessor {
    public List<Integer>  failingGrades(List<Integer> grades) {
        List<Integer> failing = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40) {
                failing.add(grade);
            }
        }
        return failing;
    }

    double averageGrade(List<Integer> grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    List<Integer> roundedGrades(List<Integer> grades) {
        Professor professor = new Professor();
        double sum = 0;
        List<Integer> rounded = new ArrayList<>();
        for (int grade : grades) {
            rounded.add(professor.GradeRounding(grade));
        }
       return rounded;
    }

    int maxGrade(List<Integer> grades) {
        int max = Integer.MIN_VALUE;
        grades = roundedGrades(grades);
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
