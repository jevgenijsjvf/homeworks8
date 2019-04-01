package HW9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    public static void main(String[] args) {
        ShopService RIMI = new ShopService();
        RIMI.test1();

    }

    public void test1() {
        Shop shop = new Shop();
        Product bread = new Product("Bread", new BigDecimal("1.56"));
        shop.addProduct(bread);
        Product water = new Product("water", new BigDecimal("0.5"));
        shop.addProduct(water);
        Product butter = new Product("Butter", new BigDecimal("2.06"));
        shop.addProduct(butter);
        System.out.println(shop.products);
        shop.removeProductByName("water");
        System.out.println(shop.products);

        List<Product> productList = new ArrayList<>();
        Product CocaCola = new Product("Coca Cola 0.5 L", new BigDecimal("1.20"));
        productList.add(CocaCola);
        Product bear = new Product("Tervetes alus 0.5 L", new BigDecimal("1.42"));
        productList.add(bear);
        Product whisky = new Product("Ballantimes", new BigDecimal("25.12"));
        productList.add(whisky);
        System.out.println(productList);
        shop.addListOfProducts((ArrayList) productList);
        System.out.println(shop.products);

        System.out.println("****************Searching*****************************");
        System.out.println(shop.getProductByName("Bread"));
        System.out.println(shop.findProductInPriceRange(new BigDecimal("1.00"), new BigDecimal("3.0")));
        System.out.println("****************Test*****************************");
        int expectedResult = 5;
        int actualResult = shop.products.size();
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT size of List are equal " + expectedResult);
        } else {
            System.out.println("Test WRONG. Expected size of list must be - " + expectedResult + " but we receive: " + actualResult);
        }

    }
}
