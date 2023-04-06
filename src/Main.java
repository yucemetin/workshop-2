import abstract_classes.GameCalculator;
import abstract_classes.WomanGameCalculator;
import abstract_demo.OracleDatabaseManager;
import classes.CustomerManager;
import classes_with_attributes.Product;
import classes_with_attributes.ProductManager;
import inheritance.Customer;
import inheritance.Employee;
import inheritance.EmployeeManager;
import inheritance_demo.AskerKrediManager;
import inheritance_demo.KrediUI;
import interfaces.OracleCustomerDal;
import overriding.BaseKrediManager;
import overriding.OgrenciKrediManager;
import overriding.OgretmenKrediManager;
import overriding.TarimKrediManager;
import polymorphism_demo.BaseLogger;
import polymorphism_demo.DatabaseLogger;
import polymorphism_demo.EmailLogger;
import polymorphism_demo.FileLogger;
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
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(500);
        product.setStockAmount(3);

        Product product1 = new Product(1, "Gözlük", "Güneş gözlüğü", 250, 10);

        ProductManager productManager = new ProductManager();

        productManager.add(product);
        productManager.add(product1);

        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);
        productManager.add2(1, "", "", 2, 200);

        method_overloading.DortIslem dortIslem1 = new method_overloading.DortIslem();
        dortIslem1.add(5, 10);
        dortIslem1.add(5, 10, 15);

        Customer customer = new Customer();
        customer.id = 2;

        Employee employee = new Employee();
        employee.id = 1;

        inheritance.CustomerManager customerManager1 = new inheritance.CustomerManager();
        customerManager1.add();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.list();

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        for (BaseLogger logger : loggers) {
            logger.log("Deneme");
        }

        polymorphism_demo.CustomerManager customerManager2 = new polymorphism_demo.CustomerManager(new EmailLogger());
        customerManager2.add();

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgrenciKrediManager(), new OgretmenKrediManager(), new TarimKrediManager()};

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.getClass() + " :" + krediManager.hesapla(1000));
        }

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();

        abstract_demo.CustomerManager customerManager3 = new abstract_demo.CustomerManager(new OracleDatabaseManager());
        customerManager3.getCustomers();

        interfaces.CustomerManager customerManager4 = new interfaces.CustomerManager(new OracleCustomerDal());
        customerManager4.add();
    }
}