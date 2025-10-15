public class Professor {
    public int GradeRounding(int grade) {
        if (grade < 38) {
            return grade;
        } else if (grade % 5 >= 3) {
            return grade + (5 - (grade % 5));
        } else {
            return grade;
        }
    }
}
