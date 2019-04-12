package HW12Final;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Database implements BaseOperation<Product> {
    Map<Long, Product> products = new HashMap<>();

    @Override
    public void addProduct(Product item) {
        item.setId(Long.valueOf(products.size()+1));
        products.put(item.getId(),item);
    }

    @Override
    public Product findById(Long id) throws ItemNotFoundException{
        if (products.containsKey(id)) {
            return products.get(id);
        } else {
            throw new ItemNotFoundException(id);
        }
    }

    @Override
    public Product findByCategory(Enum Category) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    public void setDiscountbyID (Long id, BigDecimal discount) {
        if (products.containsKey(id)) {
           products.get(id).setDiscount((discount));
        }
    }

    public void setDescriptionbyID (Long id, String description) {
        if (products.containsKey(id)) {
            products.get(id).setDescription(description);
        }
    }
}
