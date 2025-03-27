import entities.Quadrado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Quadrado x, y;
        x = new Quadrado();
        y = new Quadrado();

        System.out.println("Fale as medidas dos lados do quadrado X:");
        x.a = ler.nextDouble();
        x.b = ler.nextDouble();
        x.c = ler.nextDouble();
        x.d = ler.nextDouble();

        System.out.println("Fale as medidas dos lados do quadrado Y:");
        y.a = ler.nextDouble();
        y.b = ler.nextDouble();
        y.c = ler.nextDouble();
        y.d = ler.nextDouble();

        double areaX = x.a * x.b * x.c * x.d;
        double areaY = y.a * y.b * y.c * y.d;

        System.out.println("Area do Quadrado X:" + areaX);
        System.out.println("Area do Quadrado Y:" + areaY);

        if (areaX > areaY) {
            System.out.println("A área do Quadrado X é maior que a área do Quadrado Y");
        } else {
            System.out.println("A área do Quadrado Y é maior que a área do Quadrado X");
        }

        ler.close();
    }
}