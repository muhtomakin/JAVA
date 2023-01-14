package oopIntro;
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(
                1,
                "Lenovo V14",
                15000,
                "16 gb RAM",
                10
        );
        //product1.id = 1;
        //product1.name = "Lenovo V14";
        //product1.unitPrice = 15000;
        //product1.detail = "16 gb RAM";

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenovo V15");
        product2.setDetail("16 gb RAM");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        Product product3 = new Product();

        Product[] products = {
            product1,
            product2,
            product3,
        };

        //for (Product product : products) {
        //    System.out.println(product.getUnitPriceAfterDiscount());
        //}

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Computer");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("House/Garden");

        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);

    }
}