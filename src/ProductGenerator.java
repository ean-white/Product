import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class ProductGenerator {

    public static void main(String[] args) throws FileNotFoundException {
	    Scanner in = new Scanner(System.in);
        int index = 1;
        ArrayList<Product> products = new ArrayList<>();

        while (SafeInput.getYNConfirm(in, "Create new Product object?")) {
            System.out.println("Product ID: ");
            String productName = in.nextLine();
            System.out.println("\nProduct Name: ");
            String productDesc = in.nextLine();
            System.out.println("\nProduct Description: ");
            String ID = in.nextLine();
            System.out.println("\nCost: ");
            double cost = in.nextDouble();
            products.add(new Product(Integer.toString(index),ID, productName, productDesc, cost));
            index++;
        }
        System.out.println("\nEnter output file name: ");
        String outputFile = in.nextLine();
        PrintWriter out = new PrintWriter(outputFile);
        for (Product product : products) {
            out.println(product.toCSVDataRecord());
        }

        out.close();
    }
}
