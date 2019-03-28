package HW9;

import java.math.BigDecimal;

public class ShopService {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Product bread=new Product("Bread",new BigDecimal("1.56"));
        shop.addProduct(bread);
        System.out.println(shop.products);

        Product butter=new Product("Butter",new BigDecimal("2.06"));
        Product CocaCola=new Product("Coca Cola 0.5 L",new BigDecimal("1.20"));
        Product bear=new Product("Tervetes alus 0.5 L",new BigDecimal("1.42"));
        Product whisky=new Product("Ballantimes",new BigDecimal("25.12"));
        for (int i =0 ; i<4; i++) {

        }
        shop.addListOfProducts(bear);
        System.out.println(shop.products);
    }
}
