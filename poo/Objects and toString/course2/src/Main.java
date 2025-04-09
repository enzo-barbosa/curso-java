import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = ler.nextLine();
        System.out.println("Price:");
        product.price = ler.nextDouble();
        System.out.println("Quantity in Stock:");
        product.quantity = ler.nextInt();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = ler.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from stock:");
        quantity = ler.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);


        ler.close();
    }
}