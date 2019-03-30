package HW9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    List<Product> products =new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public void addListOfProducts(ArrayList items) {
        //Collections<Product producti> col=new ArrayList<String>();
        products.addAll(items);
    }
    public void removeProductByName (String name) {
        for (int i =0;i<products.size();i++ ) {
            products.get(i).getName();
            if (products.get(i).getName().equals(name)) {
                System.out.println("Product which you are remove: "+products.get(i));
                products.remove(products.get(i));
            }
        }
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
        for (int i =0;i<products.size();i++ ) {
            BigDecimal x = products.get(i).getPrice();
            if ((x.compareTo(maxPrice) <=0) && (x.compareTo(minPrice) >=0)) {
                System.out.println("Product which are in price range: "+products.get(i));
            }

        }
    }
}

