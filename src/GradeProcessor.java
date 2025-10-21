public class GradeProcessor {
    public int[]  failingGrades(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }
        int[] failing = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failing[index] = grade;
                index++;
            }
        }
        return failing;
    }

    double averageGrade(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    int[] roundedGrades(int[] grades) {
        Professor professor = new Professor();
        double sum = 0;
        int[] rounded = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            rounded[i] = professor.GradeRounding(grades[i]);
        }
        return rounded;
    }

    int maxGrade(int[] grades) {
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