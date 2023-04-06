import classes.CustomerManager;
import classes_with_attributes.Product;
import classes_with_attributes.ProductManager;
import recapdemo_classes.DortIslem;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(24, 12));
        System.out.println(dortIslem.cikar(24, 12));
        System.out.println(dortIslem.bol(24, 12));
        System.out.println(dortIslem.carp(24, 12));

        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}