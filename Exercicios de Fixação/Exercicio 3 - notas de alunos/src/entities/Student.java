package entities;

public class Student {
    public String name;
    public int n1;
    public int n2;
    public int n3;

    public int finalGrade() {
        return n1 + n2 + n3;
    }

    public double missingPoints() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }
}
