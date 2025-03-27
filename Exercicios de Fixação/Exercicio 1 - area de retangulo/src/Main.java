import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();


        System.out.println("Enter rectangle width an height:");
        rectangle.width = ler.nextDouble();
        rectangle.height = ler.nextDouble();

        System.out.println(rectangle.mostrarResultado());

        ler.close();

    }
}