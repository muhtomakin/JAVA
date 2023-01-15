package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
        Product product1 = new Product(1, 1, "Milk", 10, 50);
        productService.add(product1);
    }
}