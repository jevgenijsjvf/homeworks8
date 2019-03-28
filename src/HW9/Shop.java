package HW9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> products =new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public void addListOfProducts(Product product) {
        products.addAll(products);
    }
    public void removeProductByName (Product product) {
        products.remove(product);
    }
    public void getProductByName (String name) {
        for (int i =0;i<products.size();i++ ) {
            products.get(i).getName();
            if (products.get(i).getName().equals(name)) {
                System.out.println("Product which you are search: "+products.get(i));
            }
        }
    }
    public void findProductInPriceRange (BigDecimal minPrice, BigDecimal maxPrice) {

    }
}

