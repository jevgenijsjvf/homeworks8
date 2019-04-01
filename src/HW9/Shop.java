package HW9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addListOfProducts(ArrayList items) {
        products.addAll(items);
    }

    public void removeProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println("Product which you are remove: " + products.get(i));
                products.remove(products.get(i));
            }
        }
    }

    public Product getProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return products.get(i);
            }

        }
        return null;
    }

    public List<Product> findProductInPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        List<Product> findProduct = new ArrayList<>();
        int x = 0;
        for (int i = 0; i < products.size(); i++) {
            if ((products.get(i).getPrice().compareTo(maxPrice) <= 0) && (products.get(i).getPrice().compareTo(minPrice) >= 0)) {
                findProduct.add(x, products.get(i));
            }

        }
        return findProduct;
    }
}

