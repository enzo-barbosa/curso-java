import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }


        ler.close();
    }
}