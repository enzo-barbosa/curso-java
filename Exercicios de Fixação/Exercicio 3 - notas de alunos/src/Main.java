import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name: ");
        student.name = ler.next();
        System.out.println("Grade 1:");
        student.n1 = ler.nextInt();
        System.out.println("Grade 2:");
        student.n2 = ler.nextInt();
        System.out.println("Grade 3:");
        student.n3 = ler.nextInt();

        System.out.println("Final grade: " + student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("Failed");
            System.out.println("Missing points: " + student.missingPoints());
        } else {
            System.out.println("Pass");
        }
    }
}